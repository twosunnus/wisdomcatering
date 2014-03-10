<%--
  Created by IntelliJ IDEA.
  User: sunqichang
  Date: 14-3-10
  Time: 下午9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Build CRUD DataGrid with jQuery EasyUI - jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/demo/demo.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.6.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.edatagrid.js"></script>
</head>
<body>
<h2>CRUD DataGrid</h2>

<div class="demo-info" style="margin-bottom:10px">
    <div class="demo-tip icon-tip">&nbsp;</div>
    <div>Double click the row to begin editing.</div>
</div>

<table id="dg" title="My Users" style="width:700px;height:250px"
       toolbar="#toolbar" pagination="true" idField="id"
       rownumbers="true" fitColumns="true" singleSelect="true">
    <thead>
    <tr>
        <th field="firstname" width="50" editor="{type:'validatebox',options:{required:true}}">First Name</th>
        <th field="lastname" width="50" editor="{type:'validatebox',options:{required:true}}">Last Name</th>
        <th field="phone" width="50" editor="text">Phone</th>
        <th field="email" width="50" editor="{type:'validatebox',options:{validType:'email'}}">Email</th>
    </tr>
    </thead>
</table>
<div id="toolbar">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true"
       onclick="javascript:$('#dg').edatagrid('addRow')">New</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true"
       onclick="javascript:$('#dg').edatagrid('destroyRow')">Destroy</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true"
       onclick="javascript:$('#dg').edatagrid('saveRow')">Save</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-undo" plain="true"
       onclick="javascript:$('#dg').edatagrid('cancelRow')">Cancel</a>
</div>
<script type="text/javascript">
    $(function () {
        $('#dg').edatagrid({
            url: 'get_users.php',
            saveUrl: 'save_user.php',
            updateUrl: 'update_user.php',
            destroyUrl: 'destroy_user.php'
        });
    });
</script>

</body>
</html>
