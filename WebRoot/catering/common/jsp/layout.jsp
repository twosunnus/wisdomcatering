<%--
  Created by IntelliJ IDEA.
  User: sunqichang
  Date: 14-3-9
  Time: 下午3:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>智慧餐厅</title>
</head>
<body class="easyui-layout">
<div region="north" border="false" split="false" style="height:60px;padding:5px">
    <jsp:include page="north.jsp"/>
</div>
<div region="west" noheader="true" border="false" split="false" style="width:225px;padding:5px;">
    <jsp:include page="west.jsp"/>
</div>
<div region="south" border="false" split="false" style="height:50px;padding:5px;">
    <jsp:include page="south.jsp"/>
</div>

<div region="center" noheader="true" split="false" border="false" style="padding:5px;">
    <jsp:include page="center.jsp"/>
</div>

</body>
</html>
