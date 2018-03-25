package com.zmy.wechatsell.handler;

import com.zmy.wechatsell.VO.ResultVO;
import com.zmy.wechatsell.config.ProjectUrlConfig;
import com.zmy.wechatsell.exception.ResponseBankException;
import com.zmy.wechatsell.exception.SellException;
import com.zmy.wechatsell.exception.SellerAuthorizeException;
import com.zmy.wechatsell.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 廖师兄
 * 2017-07-30 17:44
 */
@ControllerAdvice
public class SellExceptionHandler {

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    //拦截登录异常
    //http://sell.natapp4.cc/sell/wechat/qrAuthorize?returnUrl=http://sell.natapp4.cc/sell/seller/login
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException() {
        return new ModelAndView("redirect:"
        .concat(projectUrlConfig.getWechatOpenAuthorize())
        .concat("/sell/wechat/qrAuthorize")
        .concat("?returnUrl=")
        .concat(projectUrlConfig.getSell())
        .concat("/sell/seller/login"));
    }

    /**
     * 全局异常处理
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = SellException.class)
    public ResultVO handlerSellerException(SellException e) {
        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }

    /**
     * 银行类需要返回不正确的时候不要200的码
     * @param e
     */
    @ExceptionHandler(value = ResponseBankException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void handlerBankException(ResponseBankException e) {

    }

}
