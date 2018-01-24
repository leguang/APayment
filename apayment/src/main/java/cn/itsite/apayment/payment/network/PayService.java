package cn.itsite.apayment.payment.network;


/**
 * @version v0.0.0
 * @Author leguang
 * @E-mail langmanleguang@qq.com
 * @Blog https://github.com/leguang
 * @Time 2018/1/12 0012 11:17
 * @Description retrofit请求接口。
 */

public interface PayService {

    /**
     * 微信、支付宝等第三方支付物业缴费订单.
     */
    String requestOrder = "http://www.aglhz.com:8090/sub_property_ysq" + "/property/bill/client/pay-bill";

//    @GET
//    Call<ResponseBody> getOrder(@Url String url,
//                                @Query("token") String token,
//                                @Query("billFids") String billFids,
//                                @Query("payMethod") int payMethod);
//
//    @POST
//    Call<ResponseBody> postOrder(@Url String url,
//                                 @Query("token") String token,
//                                 @Query("billFids") String billFids,
//                                 @Query("payMethod") int payMethod);

    String requestPayResult = "http://www.aglhz.com:8090/sub_property_ysq" + "/trade/wxpay/order-query-url";

}