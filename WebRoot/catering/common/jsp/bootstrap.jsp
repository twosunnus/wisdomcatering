<%--
  Created by IntelliJ IDEA.
  User: sunqichang
  Date: 14-3-9
  Time: 下午5:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <%@include file="../include/base.jsp" %>
    <link rel="stylesheet" type="text/css"
          href="<%=webRoot%>/common/scripts/bootstrap-3.0.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css"
          href="<%=webRoot%>/common/scripts/bootstrap-3.0.3-dist/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="<%=webRoot%>/common/scripts/jquery-2.0.2.min.js"></script>
    <script type="text/javascript" src="<%=webRoot%>/common/scripts/bootstrap-3.0.3-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
<div class="row-fluid">
<div class="span12">
<h3>
    h3. 这是一套可视化布局系统.
</h3>

<div class="navbar">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a data-target=".navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar"><span
                    class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></a> <a href="#"
                                                                                                                class="brand">网站名</a>

            <div class="nav-collapse collapse navbar-responsive-collapse">
                <ul class="nav">
                    <li class="active">
                        <a href="#">主页</a>
                    </li>
                    <li>
                        <a href="#">链接</a>
                    </li>
                    <li>
                        <a href="#">链接</a>
                    </li>
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">下拉菜单<strong
                                class="caret"></strong></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="#">下拉导航1</a>
                            </li>
                            <li>
                                <a href="#">下拉导航2</a>
                            </li>
                            <li>
                                <a href="#">其他</a>
                            </li>
                            <li class="divider">
                            </li>
                            <li class="nav-header">
                                标签
                            </li>
                            <li>
                                <a href="#">链接1</a>
                            </li>
                            <li>
                                <a href="#">链接2</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav pull-right">
                    <li>
                        <a href="#">右边链接</a>

                    </li>
                    <li class="divider-vertical">
                    </li>
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">下拉菜单<strong
                                class="caret"></strong></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="#">下拉导航1</a>
                            </li>
                            <li>
                                <a href="#">下拉导航2</a>
                            </li>
                            <li>
                                <a href="#">其他</a>
                            </li>
                            <li class="divider">
                            </li>
                            <li>
                                <a href="#">链接3</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>

        </div>
    </div>

</div>
<div class="row-fluid">
    <div class="span6">
        <div class="accordion" id="accordion-165281">
            <div class="accordion-group">
                <div class="accordion-heading">
                    <a class="accordion-toggle collapsed" data-toggle="collapse" data-parent="#accordion-165281"
                       href="#accordion-element-997306">选项卡 #1</a>
                </div>
                <div id="accordion-element-997306" class="accordion-body collapse">
                    <div class="accordion-inner">
                        功能块...
                    </div>
                </div>
            </div>
            <div class="accordion-group">
                <div class="accordion-heading">
                    <a class="accordion-toggle collapsed" data-toggle="collapse" data-parent="#accordion-165281"
                       href="#accordion-element-694247">选项卡 #2</a>
                </div>
                <div id="accordion-element-694247" class="accordion-body collapse">
                    <div class="accordion-inner">
                        功能块...
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="span6">
        <div class="tabbable" id="tabs-425276">
            <ul class="nav nav-tabs">
                <li>
                    <a href="#panel-898716" data-toggle="tab">第一部分</a>
                </li>
                <li class="active">
                    <a href="#panel-285837" data-toggle="tab">第二部分</a>
                </li>
            </ul>
            <div class="tab-content">
                <div class="tab-pane" id="panel-898716">
                    <p>
                        第一部分内容.
                    </p>
                </div>
                <div class="tab-pane active" id="panel-285837">
                    <p>
                        第二部分内容.
                    </p>
                </div>
            </div>
        </div>
        <ul class="breadcrumb">
            <li>
                <a href="#">主页</a> <span class="divider">/</span>
            </li>
            <li>
                <a href="#">类目</a> <span class="divider">/</span>
            </li>
            <li class="active">
                主题
            </li>
        </ul>
        <form class="form-search">
            <input class="input-medium search-query" type="text"/>
            <button type="submit" class="btn">查找</button>
        </form>
        <table class="table table-hover table-condensed">
            <thead>
            <tr>
                <th>
                    编号
                </th>
                <th>
                    产品
                </th>
                <th>
                    交付时间
                </th>
                <th>
                    状态
                </th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    1
                </td>
                <td>
                    TB - Monthly
                </td>
                <td>
                    01/04/2012
                </td>
                <td>
                    Default
                </td>
            </tr>
            <tr class="success">
                <td>
                    1
                </td>
                <td>
                    TB - Monthly
                </td>
                <td>
                    01/04/2012
                </td>
                <td>
                    Approved
                </td>
            </tr>
            <tr class="error">
                <td>
                    2
                </td>
                <td>
                    TB - Monthly
                </td>
                <td>
                    02/04/2012
                </td>
                <td>
                    Declined
                </td>
            </tr>
            <tr class="warning">
                <td>
                    3
                </td>
                <td>
                    TB - Monthly
                </td>
                <td>
                    03/04/2012
                </td>
                <td>
                    Pending
                </td>
            </tr>
            <tr class="info">
                <td>
                    4
                </td>
                <td>
                    TB - Monthly
                </td>
                <td>
                    04/04/2012
                </td>
                <td>
                    Call in to confirm
                </td>
            </tr>
            </tbody>
        </table>
        <button class="btn" type="button">按钮</button>
        <div class="pagination pagination-centered">
            <ul>
                <li>
                    <a href="#">上一页</a>
                </li>
                <li>
                    <a href="#">1</a>
                </li>
                <li>
                    <a href="#">2</a>
                </li>
                <li>
                    <a href="#">3</a>
                </li>
                <li>
                    <a href="#">4</a>
                </li>
                <li>
                    <a href="#">5</a>
                </li>
                <li>
                    <a href="#">下一页</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="row-fluid">
    <div class="span12">
        <h3>
            h3. 这是一套可视化布局系统.
        </h3>
    </div>
</div>
</div>
</div>
</div>
</body>
</html>
