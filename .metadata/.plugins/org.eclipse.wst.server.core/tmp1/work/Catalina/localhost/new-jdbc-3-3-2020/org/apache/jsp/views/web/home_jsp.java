/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2021-03-05 01:04:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1614902355209L));
    _jspx_dependants.put("jar:file:/F:/java-web/java-web-3-2-2021/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/new-jdbc-3-3-2020/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1614113868963L));
    _jspx_dependants.put("jar:file:/F:/java-web/java-web-3-2-2021/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/new-jdbc-3-3-2020/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1614900435280L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write('\r');
      out.write('\n');
      out.write("\t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Trang chủ</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-lg-3\">\r\n");
      out.write("\r\n");
      out.write("        <h1 class=\"my-4\">Shop Name</h1>\r\n");
      out.write("        <div class=\"list-group\">\r\n");
      out.write("          <a href=\"#\" class=\"list-group-item\">Category 1</a>\r\n");
      out.write("          <a href=\"#\" class=\"list-group-item\">Category 2</a>\r\n");
      out.write("          <a href=\"#\" class=\"list-group-item\">Category 3</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.col-lg-3 -->\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-lg-9\">\r\n");
      out.write("\r\n");
      out.write("        <div id=\"carouselExampleIndicators\" class=\"carousel slide my-4\" data-ride=\"carousel\">\r\n");
      out.write("          <ol class=\"carousel-indicators\">\r\n");
      out.write("            <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("            <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("            <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("          </ol>\r\n");
      out.write("          <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("            <div class=\"carousel-item active\">\r\n");
      out.write("              <img class=\"d-block img-fluid\" src=\"http://placehold.it/900x350\" alt=\"First slide\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"carousel-item\">\r\n");
      out.write("              <img class=\"d-block img-fluid\" src=\"http://placehold.it/900x350\" alt=\"Second slide\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"carousel-item\">\r\n");
      out.write("              <img class=\"d-block img-fluid\" src=\"http://placehold.it/900x350\" alt=\"Third slide\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"sr-only\">Previous</span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"sr-only\">Next</span>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"card h-100\">\r\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"card-title\">\r\n");
      out.write("                  <a href=\"#\">Item One</a>\r\n");
      out.write("                </h4>\r\n");
      out.write("                <h5>$24.99</h5>\r\n");
      out.write("                <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card-footer\">\r\n");
      out.write("                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"card h-100\">\r\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"card-title\">\r\n");
      out.write("                  <a href=\"#\">Item Two</a>\r\n");
      out.write("                </h4>\r\n");
      out.write("                <h5>$24.99</h5>\r\n");
      out.write("                <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit amet.</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card-footer\">\r\n");
      out.write("                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"card h-100\">\r\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"card-title\">\r\n");
      out.write("                  <a href=\"#\">Item Three</a>\r\n");
      out.write("                </h4>\r\n");
      out.write("                <h5>$24.99</h5>\r\n");
      out.write("                <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card-footer\">\r\n");
      out.write("                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"card h-100\">\r\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"card-title\">\r\n");
      out.write("                  <a href=\"#\">Item Four</a>\r\n");
      out.write("                </h4>\r\n");
      out.write("                <h5>$24.99</h5>\r\n");
      out.write("                <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card-footer\">\r\n");
      out.write("                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"card h-100\">\r\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"card-title\">\r\n");
      out.write("                  <a href=\"#\">Item Five</a>\r\n");
      out.write("                </h4>\r\n");
      out.write("                <h5>$24.99</h5>\r\n");
      out.write("                <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit amet.</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card-footer\">\r\n");
      out.write("                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"card h-100\">\r\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"card-title\">\r\n");
      out.write("                  <a href=\"#\">Item Six</a>\r\n");
      out.write("                </h4>\r\n");
      out.write("                <h5>$24.99</h5>\r\n");
      out.write("                <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card-footer\">\r\n");
      out.write("                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.col-lg-9 -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.row -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
