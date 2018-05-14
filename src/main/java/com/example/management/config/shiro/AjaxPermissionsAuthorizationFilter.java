package com.example.management.config.shiro;

public class AjaxPermissionsAuthorizationFilter {

//    @Override
//    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
////        JSONObject jsonObject = new JSONObject();
////        jsonObject.put("returnCode", ErrorEnum.E_20011.getErrorCode());
////        jsonObject.put("returnMsg", ErrorEnum.E_20011.getErrorMsg());
////        PrintWriter out = null;
////        HttpServletResponse res = (HttpServletResponse) response;
////        try {
////            res.setCharacterEncoding("UTF-8");
////            res.setContentType("application/json");
////            out = response.getWriter();
////            out.println(jsonObject);
////        } catch (Exception e) {
////        } finally {
////            if (null != out) {
////                out.flush();
////                out.close();
////            }
////        }
////        return false;
//        return true;
//    }
//
//    @Bean
//    public FilterRegistrationBean registration(AjaxPermissionsAuthorizationFilter filter) {
////        FilterRegistrationBean registration = new FilterRegistrationBean(filter);
////        registration.setEnabled(false);
////        return registration;
//        return null;
//    }
}
