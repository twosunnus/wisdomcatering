<%--
  Created by IntelliJ IDEA.
  User: sunqichang
  Date: 14-3-9
  Time: 下午9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../include/easyui_header.jsp" %>
<%@include file="../include/bootstrap_header.jsp" %>
<div class="easyui-accordion" data-options="multiple:true" border="false" plain="true" style="width:200px;">
    <div title="Language" data-options="iconCls:'icon-ok'" style="overflow:auto;padding:10px;">
        <ul class="nav">
            <li class=""><a href="#"
                            onclick="addTab(this.innerText,'http://www.baidu.com')">单个还是全部引入</a></li>
            <li class=""><a href="#js-data-attrs" onclick="addTab(this.innerText,'http://www.qq.com')">Data属性</a>
            </li>
            <li class=""><a href="#js-programmatic-api"
                            onclick="">编程式API</a></li>
            <li class=""><a href="#js-noconflict">避免冲突</a></li>
            <li class=""><a href="#js-events">事件</a></li>
        </ul>
    </div>
    <div title="Java" style="overflow:auto;padding:10px;">
        <ul class="nav">
            <li class=""><a href="#js-individual-compiled">单个还是全部引入</a></li>
            <li class=""><a href="#js-data-attrs">Data属性</a></li>
            <li class=""><a href="#js-programmatic-api">编程式API</a></li>
            <li class=""><a href="#js-noconflict">避免冲突</a></li>
            <li class=""><a href="#js-events">事件</a></li>
        </ul>
    </div>
    <div title="C#">
        <p>C# is a multi-paradigm programming language encompassing strong typing, imperative, declarative, functional,
            generic, object-oriented (class-based), and component-oriented programming disciplines.</p>
    </div>
    <div title="Ruby">
        <p>A dynamic, reflective, general-purpose object-oriented programming language.</p>
    </div>
    <div title="Fortran">
        <ul class="nav">
            <li class=""><a href="#js-individual-compiled">单个还是全部引入</a></li>
            <li class=""><a href="#js-data-attrs">Data属性</a></li>
            <li class=""><a href="#js-programmatic-api">编程式API</a></li>
            <li class=""><a href="#js-noconflict">避免冲突</a></li>
            <li class=""><a href="#js-events">事件</a></li>
        </ul>
    </div>
</div>
