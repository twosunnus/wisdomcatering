<%--
  Created by IntelliJ IDEA.
  User: sunqichang
  Date: 14-3-9
  Time: 下午4:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    //添加tab页签
    function addTab(title, url) {
        if ($('#tabs').tabs('exists', title)) {
            //如果tab已经存在,则选中
            $('#tabs').tabs('select', title);
        } else {
            var content = '';
            if (url) {
                content = "<iframe scrolling='auto' frameborder='0' style='width:100%;height:100%;' src=" + url + "></iframe>";
            } else {
                content = "url为空";
            }
            $('#tabs').tabs('add', {
                title: title,
                content: content,
                closable: true,
                style: "padding:10px",
                tools: [
                    {
                        iconCls: 'icon-mini-refresh',
                        handler: function () {
                            $('#tabs').tabs('getSelected').panel('refresh');
                        }
                    }
                ]
            });
        }
    }

    /**
     * 刷新tab
     * @cfg
     *example: {tabTitle:'tabTitle',url:'refreshUrl'}
     *如果tabTitle为空，则默认刷新当前选中的tab
     *如果url为空，则默认以原来的url进行reload
     */
    function refreshTab(cfg) {
        var refresh_tab = cfg.tabTitle ? $('#tabs').tabs('getTab', cfg.tabTitle) : $('#tabs').tabs('getSelected');
        if (refresh_tab && refresh_tab.find('iframe').length > 0) {
            var _refresh_ifram = refresh_tab.find('iframe')[0];
            var refresh_url = cfg.url ? cfg.url : _refresh_ifram.src;
            //_refresh_ifram.src = refresh_url;  
            _refresh_ifram.contentWindow.location.href = refresh_url;
        }
    }
</script>
<div id="tabs" class="easyui-tabs" fit="true" border="false" plain="true">
    <div title="欢迎页面" style="overflow:auto;" cache="true">
        <iframe scrolling="no" frameborder="0" id="welcome"
                style="width:100%;height:100%;"
                src="/catering/common/jsp/welcome.jsp"></iframe>
    </div>
</div>
