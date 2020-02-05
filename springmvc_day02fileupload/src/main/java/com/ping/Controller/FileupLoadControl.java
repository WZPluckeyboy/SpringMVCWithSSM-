package com.ping.Controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;
@Controller
@RequestMapping("/user")
public class FileupLoadControl {
    //文件上传
    @RequestMapping("/fileupload1")
    public  String fileupload1(HttpServletRequest request) throws Exception{
        System.out.println("文件上传");
        //上传位置
       String path= request.getSession().getServletContext().getRealPath("/uploads/");
        File file=new File(path);
        if(!file.exists()){
            //创建该文件夹
            file.mkdirs();

        }
        //解析request对象，获取文件项
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);
        List<FileItem> items= upload.parseRequest(request);
        for(FileItem item:items){
            if(item.isFormField()){

            }else{
             String filename=  item.getName();
             String uuid= UUID.randomUUID().toString().replace("-","");
             filename=uuid+filename;
             item.write(new File(path,filename));
             item.delete();
            }
        }
        return "success";
    }
    //springMVC方式上传
    @RequestMapping("/fileupload2")
    public  String fileupload2(HttpServletRequest request, MultipartFile upload) throws Exception{
        System.out.println("文件上传");
        //上传位置
        String path= request.getSession().getServletContext().getRealPath("/uploads/");
        File file=new File(path);
        if(!file.exists()){
            //创建该文件夹
            file.mkdirs();

        }

        String filename= upload.getOriginalFilename();
        String uuid= UUID.randomUUID().toString().replace("-","");
        filename=uuid+filename;
        upload.transferTo(new File(path,filename));
        return "success";
    }
    //跨服务器方式上传
    @RequestMapping("/fileupload3")
    public  String fileupload3( MultipartFile upload) throws Exception{
        String path="http://localhost:9090/uploads/";
        System.out.println("文件上传");
        String filename= upload.getOriginalFilename();
        String uuid= UUID.randomUUID().toString().replace("-","");
        filename=uuid+filename;
       //跨服务器上传
      Client client=  Client.create();
     WebResource webResource= client.resource(path+filename);
     webResource.put(upload.getBytes());

        return "success";
    }

}
