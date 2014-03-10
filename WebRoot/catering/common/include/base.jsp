<%
    String skinName = "bootstrap";
    if (session.getAttribute("skinName") != null) {
        skinName = (String) session.getAttribute("skinName");
    }
%>
