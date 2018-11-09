<%-- 
    Document   : MeuJSP
    Created on : 09/11/2018, 15:20:13
    Author     : tiago.lucas
--%>

<%@page import="gg.NovoClass"%>
<%@page contentType="text/html" pageEncoding="windows-1250"%>
<%@page import="ejbb.Meu_EJBLocal" %>
<%!
    private Meu_EJBLocal me = null;
    NovoClass nc = new NovoClass();
    
    public void jspDestroy(){
    me = null;
}

    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>MEU JSP</h1>
        <%
            me = nc.lookupMeu_EJBLocal();
            out.println(me.Treta());
            %>
    </body>
</html>
