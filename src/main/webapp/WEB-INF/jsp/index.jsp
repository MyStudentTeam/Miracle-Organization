<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<div style="width: 700px">
    <form action="${pageContext.request.contextPath}/edocEntry/edoclist" method="get" style="width: 700px"
          id="#update_from">
        <p align="center"><span style="padding-right: 100px ">文档分类：
                <select name="categoryId">
                    <option value="">全部</option>
                    <c:forEach var="cat" items="${categoryList}">
                        <option value="${cat.id}">${cat.name}</option>
                    </c:forEach>
                </select>
            <input type="submit" value="查询"/>
            </span>


            <input type="button" onclick="sess()" value="新增电子文档">


        </p>
        <table border="1px" cellpadding="0px" cellspacing="0px" width="700px">
            <tr>
                <td colspan="6" align="center" style="font-size: 26px">电子文档列表</td>
            </tr>
            <tr>
                <td>文档编号</td>
                <td>文档名称</td>
                <td>文档摘要</td>
                <td>上传人</td>
                <td>上传日期</td>
                <td>操作</td>
            </tr>

            <c:forEach items="${entryList}" var="entry">
                <tr>
                    <td>${entry.id}</td>
                    <td>${entry.title}</td>
                    <td>${entry.summary}</td>
                    <td>${entry.uploaduser}</td>
                    <td><fmt:formatDate value="${entry.createDate}" pattern="yyyy-MM-dd"></fmt:formatDate>  </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/edocEntry/openupdate?id=${entry.id}">修改</a>
                        <a id="delete" entryid="${entry.id}" href="javascript:void(0)">删除</a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <th colspan="6">
                    <div id="mess">
                    </div>
                </th>
            </tr>
        </table>

    </form>

</div>

<script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>
<%--
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
--%>
<script>

    $(function () {
        $("tr:even").css("background-color", "#CCF6CE");
        $("tr:eq(1)").css("background-color", "#9C9C9C");
        $("tr:eq(0)").css("background-color", "#FFFFFF");
        $("#delete").click(function () {
            var entryid = $(this);
            $.ajax({
                    type: "GET",//请求类型
                    url: "/edocEntry/delete", //请求
                    data: "entryid=" + entryid.attr("entryid"),
                    dataType: "json",//ajax接口（请求url）返回的数据类型*!/*/
                    success:
                        function (data) {
                            //data：返回数据（json对象）
                            if (data.code == 100) {
                                window.location.href = "${pageContext.request.contextPath}/edocEntry/edoclist";
                                $("#mess").html("删除成功");
                            } else {
                                alert(data.upd_error)
                                $("#mess").html(data.del_error + "11");
                            }
                        }

                    ,
                    error: function () {

                        alert("加载失败！");
                    }
                }
            )
        });
    });

    function sess() {
        window.location.href = "/edocEntry/openAddList";
    }
</script>
</body>
</html>
