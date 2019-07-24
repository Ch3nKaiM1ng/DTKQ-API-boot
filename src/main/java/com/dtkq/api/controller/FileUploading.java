package com.dtkq.api.controller;

import com.dtkq.api.utils.ReturnDiscern;
import com.dtkq.api.utils.UpdateImgNameUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/file")
public class FileUploading {

    private ReturnDiscern re ;

//    添加文件
    @RequestMapping("/uploading")
    public Map<String, Object> ImgUploading(MultipartFile file){
        String[] data = new String[2];
        if (file==null){
           return re.ERRORMSG("文件为空！");
        }
        else {
            String url = UpdateImgNameUtils.UpdateImgName(file);
            return re.SUCCESSOBJ(url);
        }
    }
}
