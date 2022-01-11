package irm.cm.swpbackend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

import irm.cm.swpbackend.Entity.Sensitiveword;
import irm.cm.swpbackend.Result.Result;
import irm.cm.swpbackend.Service.SensitivewordService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@CrossOrigin
public class UploadController {
    
    @Autowired
    SensitivewordService sensitivewordService;

    @CrossOrigin
    @RequestMapping(value="/singleupload")
    @ResponseBody
    public Result requestMethodName(@RequestBody Sensitiveword sensitiveword) {
        //单条上传处理
        System.out.println(sensitiveword);
        String wordname = sensitiveword.getWordname();
        String wordpartofspeech = sensitiveword.getWordpartofspeech();
        Boolean sensitiveword_isexist = sensitivewordService.isExist(wordname, wordpartofspeech);
        
        if(sensitiveword_isexist == true){
            //词库里已经存在词
            System.out.println("词库已存在词"+sensitiveword_isexist);
            return new Result(200);
        }else{
            Sensitiveword s = sensitiveword;
            System.out.println("词库入库"+sensitiveword_isexist);
            sensitivewordService.saveSensitiveword(s);
            return new Result(400);
        }
    }
    

}
