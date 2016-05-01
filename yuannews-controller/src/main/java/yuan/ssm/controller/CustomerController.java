package yuan.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import yuan.ssm.pojo.CSCustom;
import yuan.ssm.service.customer.NewsService;

/**
 * Created by yuan on 16-4-4.
 * 控制器－用户端-用户中心
 * 功能：用户中心页面及其功能
 */

@Controller
@RequestMapping("/user")
public class CustomerController {

    //主页
    private final String INDEX_PAGE="index";

    //每页数量
    private final int PAGE_NUM=15;

    private NewsService newsService;



    @RequestMapping("/pageIndex")
    public ModelAndView pageIndex(Integer start,Integer num,Integer p,) throws Exception {

        ModelAndView andView = new ModelAndView();
        //页面
        andView.setViewName(INDEX_PAGE);
        //list数据
        CSCustom sourceIfo = newsService.findCateSourceIfo();
        //总数
        //分类/来源数据
        return andView;
    }



    public ModelAndView cateIndex(){
      return null;
    }

    public ModelAndView sourceIndex(){
        return  null;
    }




}
