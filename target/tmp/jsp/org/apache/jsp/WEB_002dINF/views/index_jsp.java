package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>ATM_PV1.0</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" media=\"all\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"main_body\" >\r\n");
      out.write("    <span id=\"test\"></span>\r\n");
      out.write("\t<img id=\"top\" src=\"top.png\" alt=\"\">\r\n");
      out.write("\t<div id=\"form_container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h1><a>ATM_PV1.0</a></h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"form_description\">\r\n");
      out.write("\t\t\t<h2>ATM_PV1.0</h2>\r\n");
      out.write("\t\t\t<p>Go green Go easy</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<ul >\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"section_break\">\r\n");
      out.write("\t\t\t<h3>Employee details</h3>\r\n");
      out.write("\t\t\t<p></p>\r\n");
      out.write("\t\t</li>\t\t<li id=\"li_1\" >\r\n");
      out.write("\t\t<label class=\"description\" for=\"userId\">User ID </label>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<input id=\"userId\" name=\"userId\" class=\"element text small\" type=\"text\" maxlength=\"255\" value=\"\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</li>\t\t<li id=\"li_2\" >\r\n");
      out.write("\t\t<label class=\"description\" for=\"element_2\">Employee Name </label>\r\n");
      out.write("\t\t<span>\r\n");
      out.write("\t\t\t<input id=\"firstName\" name= \"firstName\" class=\"element text\" maxlength=\"255\" size=\"8\" value=\"\"/>\r\n");
      out.write("\t\t\t<label>First</label>\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t\t<span>\r\n");
      out.write("\t\t\t<input id=\"lastName\" name= \"lastName\" class=\"element text\" maxlength=\"255\" size=\"14\" value=\"\"/>\r\n");
      out.write("\t\t\t<label>Last</label>\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t\t</li>\t\t<li class=\"section_break\">\r\n");
      out.write("\t\t\t<h3>Time Sheet details</h3>\r\n");
      out.write("\t\t\t<p></p>\r\n");
      out.write("\t\t\t</li>\t\t<li id=\"li_3\" >\r\n");
      out.write("        \t\t<label class=\"description\" for=\"date\">Date </label>\r\n");
      out.write("        \t\t<span>\r\n");
      out.write("                               \t\t\t<input id=\"date_2\" name=\"element_3_2\" class=\"element text\" size=\"2\" maxlength=\"2\" value=\"\" type=\"text\"> /\r\n");
      out.write("                               \t\t\t<label for=\"element_3_2\">DD</label>\r\n");
      out.write("                               \t\t</span>\r\n");
      out.write("        \t\t<span>\r\n");
      out.write("        \t\t\t<input id=\"date_1\" name=\"element_3_1\" class=\"element text\" size=\"2\" maxlength=\"2\" value=\"\" type=\"text\"> /\r\n");
      out.write("        \t\t\t<label for=\"element_3_1\">MM</label>\r\n");
      out.write("        \t\t</span>\r\n");
      out.write("        \t\t<span>\r\n");
      out.write("        \t \t\t<input id=\"date_3\" name=\"element_3_3\" class=\"element text\" size=\"4\" maxlength=\"4\" value=\"\" type=\"text\">\r\n");
      out.write("        \t\t\t<label for=\"element_3_3\">YYYY</label>\r\n");
      out.write("        \t\t</span>\r\n");
      out.write("\r\n");
      out.write("        \t\t<span id=\"calendar_3\">\r\n");
      out.write("        \t\t\t<img id=\"cal_img_3\" class=\"datepicker\" src=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\" alt=\"Pick a date.\">\r\n");
      out.write("        \t\t</span>\r\n");
      out.write("        \t\t<script type=\"text/javascript\">\r\n");
      out.write("        \t\t\tCalendar.setup({\r\n");
      out.write("        \t\t\tinputField\t : \"date_3\",\r\n");
      out.write("        \t\t\tbaseField    : \"date\",\r\n");
      out.write("        \t\t\tdisplayArea  : \"calendar_3\",\r\n");
      out.write("        \t\t\tbutton\t\t : \"cal_img_3\",\r\n");
      out.write("        \t\t\tifFormat\t : \"%B %e, %Y\",\r\n");
      out.write("        \t\t\tonSelect\t : selectDate\r\n");
      out.write("        \t\t\t});\r\n");
      out.write("        \t\t</script>\r\n");
      out.write("\r\n");
      out.write("        \t\t</li>\t\t<li class=\"section_break\">\r\n");
      out.write("\t\t\t<h3>Module details</h3>\r\n");
      out.write("\t\t\t<p></p>\r\n");
      out.write("\t\t</li>\t\t<li id=\"li_14\" >\r\n");
      out.write("\t\t<label class=\"description\" for=\"moduleTitle\">Module/Course Title  </label>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<select class=\"element select medium\" id=\"moduleTitle\" name=\"moduleTitle\">\r\n");
      out.write("\t\t\t<option value=\"\" selected=\"selected\"></option>\r\n");
      out.write("<option value=\"1\" >ENG4053-Eng_mech</option>\r\n");
      out.write("<option value=\"2\" >PRJ6029-UG_Pro</option>\r\n");
      out.write("<option value=\"3\" >ENG4064-App_Them</option>\r\n");
      out.write("<option value=\"4\" >ENG4067-Math_Ana</option>\r\n");
      out.write("<option value=\"5\" >ENG7047-KBE</option>\r\n");
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</li>\t\t<li id=\"li_15\" >\r\n");
      out.write("\t\t<label class=\"description\" for=\"activityDesc\">Activity Description </label>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<select class=\"element select medium\" id=\"activityDesc\" name=\"activityDesc\">\r\n");
      out.write("\t\t\t<option value=\"\" selected=\"selected\"></option>\r\n");
      out.write("<option value=\"1\" >Assessment</option>\r\n");
      out.write("<option value=\"2\" >Class Contract</option>\r\n");
      out.write("<option value=\"3\" >Marking</option>\r\n");
      out.write("<option value=\"4\" >Preparation</option>\r\n");
      out.write("<option value=\"5\" >Tutorial</option>\r\n");
      out.write("<option value=\"6\" >Development</option>\r\n");
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</li>\t\t<li class=\"section_break\">\r\n");
      out.write("\t\t\t<h3>Number of Hours</h3>\r\n");
      out.write("\t\t\t<p></p>\r\n");
      out.write("\t\t</li>\t\t<li id=\"li_16\" >\r\n");
      out.write("\t\t<label class=\"description\" for=\"startTime\">Start Time </label>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<select class=\"element select small\" id=\"startTime\" name=\"startTime\">\r\n");
      out.write("\t\t\t<option value=\"\" selected=\"selected\"></option>\r\n");
      out.write("<option value=\"1\" >6:00</option>\r\n");
      out.write("<option value=\"2\" >6:30</option>\r\n");
      out.write("<option value=\"3\" >7:00</option>\r\n");
      out.write("<option value=\"4\" >7:30</option>\r\n");
      out.write("<option value=\"5\" >8:00</option>\r\n");
      out.write("<option value=\"6\" >8:30</option>\r\n");
      out.write("<option value=\"7\" >9:00</option>\r\n");
      out.write("<option value=\"8\" >9:30</option>\r\n");
      out.write("<option value=\"9\" >10:00</option>\r\n");
      out.write("<option value=\"10\" >10:30</option>\r\n");
      out.write("<option value=\"11\" >11:00</option>\r\n");
      out.write("<option value=\"12\" >11:30</option>\r\n");
      out.write("<option value=\"13\" >12:00</option>\r\n");
      out.write("<option value=\"14\" >12:30</option>\r\n");
      out.write("<option value=\"15\" >13:00</option>\r\n");
      out.write("<option value=\"16\" >13:30</option>\r\n");
      out.write("<option value=\"17\" >14:00</option>\r\n");
      out.write("<option value=\"14:30\" >14:30</option>\r\n");
      out.write("<option value=\"19\" >15:00</option>\r\n");
      out.write("<option value=\"20\" >15:30</option>\r\n");
      out.write("<option value=\"21\" >16:00</option>\r\n");
      out.write("<option value=\"22\" >16:30</option>\r\n");
      out.write("<option value=\"23\" >17:00</option>\r\n");
      out.write("<option value=\"24\" >17:30</option>\r\n");
      out.write("<option value=\"25\" >18:00</option>\r\n");
      out.write("<option value=\"26\" >18:30</option>\r\n");
      out.write("<option value=\"27\" >19:00</option>\r\n");
      out.write("<option value=\"28\" >19:30</option>\r\n");
      out.write("<option value=\"29\" >20:00</option>\r\n");
      out.write("<option value=\"30\" >20:30</option>\r\n");
      out.write("<option value=\"31\" >21:00</option>\r\n");
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</li>\t\t<li id=\"li_17\" >\r\n");
      out.write("\t\t<label class=\"description\" for=\"endTime\">End Time </label>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<select class=\"element select small\" id=\"endTime\" name=\"endTime\">\r\n");
      out.write("\t\t\t<option value=\"\" selected=\"selected\"></option>\r\n");
      out.write("<option value=\"1\" >6:00</option>\r\n");
      out.write("<option value=\"2\" >6:30</option>\r\n");
      out.write("<option value=\"3\" >7:00</option>\r\n");
      out.write("<option value=\"4\" >7:30</option>\r\n");
      out.write("<option value=\"5\" >8:00</option>\r\n");
      out.write("<option value=\"6\" >8:30</option>\r\n");
      out.write("<option value=\"7\" >9:00</option>\r\n");
      out.write("<option value=\"8\" >9:30</option>\r\n");
      out.write("<option value=\"9\" >10:00</option>\r\n");
      out.write("<option value=\"10\" >10:30</option>\r\n");
      out.write("<option value=\"11\" >11:00</option>\r\n");
      out.write("<option value=\"12\" >11:30</option>\r\n");
      out.write("<option value=\"13\" >12:00</option>\r\n");
      out.write("<option value=\"14\" >12:30</option>\r\n");
      out.write("<option value=\"15\" >13:00</option>\r\n");
      out.write("<option value=\"16\" >13:30</option>\r\n");
      out.write("<option value=\"17\" >14:00</option>\r\n");
      out.write("<option value=\"18\" >14:30</option>\r\n");
      out.write("<option value=\"19\" >15:00</option>\r\n");
      out.write("<option value=\"20\" >15:30</option>\r\n");
      out.write("<option value=\"21\" >16:00</option>\r\n");
      out.write("<option value=\"22\" >16:30</option>\r\n");
      out.write("<option value=\"23\" >17:00</option>\r\n");
      out.write("<option value=\"24\" >17:30</option>\r\n");
      out.write("<option value=\"25\" >18:00</option>\r\n");
      out.write("<option value=\"26\" >18:30</option>\r\n");
      out.write("<option value=\"27\" >19:00</option>\r\n");
      out.write("<option value=\"28\" >19:30</option>\r\n");
      out.write("<option value=\"29\" >20:00</option>\r\n");
      out.write("<option value=\"30\" >20:30</option>\r\n");
      out.write("<option value=\"21:00\" >21:00</option>\r\n");
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</li>\t\t<li id=\"li_18\" >\r\n");
      out.write("\t\t<label class=\"description\" for=\"breakTime\">Meal Break Time </label>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<select class=\"element select small\" id=\"breakTime\" name=\"breakTime\">\r\n");
      out.write("\t\t\t<option value=\"\" selected=\"selected\"></option>\r\n");
      out.write("<option value=\"00:15\" >15mins</option>\r\n");
      out.write("<option value=\"00:30\" >30mins</option>\r\n");
      out.write("<option value=\"00:45\" >45mins</option>\r\n");
      out.write("<option value=\"4\" >1hr</option>\r\n");
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</li>\t\t<li id=\"li_10\" >\r\n");
      out.write("\t\t<label class=\"description\" for=\"totalTime\">Total Time </label>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<input id=\"totalTime\" name=\"totalTime\" class=\"element text small\" type=\"text\" maxlength=\"255\" value=\"\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</li>\t\t<li class=\"section_break\">\r\n");
      out.write("\t\t\t<h3>Weekending Details</h3>\r\n");
      out.write("\t\t\t<p></p>\r\n");
      out.write("\t\t</li>\t\t<li id=\"li_13\" >\r\n");
      out.write("\t\t<label class=\"description\" for=\"weekendDay\">Weekending Day </label>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<select class=\"element select small\" id=\"weekendDay\" name=\"weekendDay\">\r\n");
      out.write("\t\t\t<option value=\"Sunday\" selected=\"selected\"> Sunday</option>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</li>\t\t<li id=\"li_4\" >\r\n");
      out.write("\t\t<label class=\"description\" for=\"weekendDate\">Weekending Date </label>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<input id=\"weekendDate\" name=\"weekendDate\" class=\"element text small\" type=\"text\" maxlength=\"255\" value=\"\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</li>\t\t<li id=\"li_5\" >\r\n");
      out.write("\t\t<label class=\"description\" for=\"weekendMonth\">Weekending Month </label>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<input id=\"weekendMonth\" name=\"weekendMonth\" class=\"element text small\" type=\"text\" maxlength=\"255\" value=\"\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</li>\t\t<li id=\"li_6\" >\r\n");
      out.write("\t\t<label class=\"description\" for=\"weekendYear\">Weekending Year </label>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<input id=\"weekendYear\" name=\"weekendYear\" class=\"element text small\" type=\"text\" maxlength=\"255\" value=\"\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t    <li class=\"buttons\">\r\n");
      out.write("\t\t\t    <input type=\"hidden\" name=\"form_id\" value=\"753413\" />\r\n");
      out.write("                <img id=\"button\" src=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<img id=\"bottom\" src=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/css/view.css");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/resources/js/view.js");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/resources/js/calendar.js");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/resources/js/jquery-2.0.3.js");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/resources/images/calendar.gif");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/resources/images/button.jpg");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/resources/images/bottom.png");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("/resources/js/biogas/biogas-calculator.js");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }
}
