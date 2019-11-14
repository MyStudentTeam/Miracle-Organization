<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KuaQ
  Date: 2019/11/14
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("tr:even").css("background-color","#CCF6CE");
        $("tr:eq(1)").css("background-color","#9C9C9C");
        $("tr:eq(0)").css("background-color","#FFFFFF")

    });
</script>


<div style="width: 700px">
    <form action="#" method="post" style="width: 700px">
        <p align="center"><span style="padding-right: 100px ">文档分类：
                <select name="category">
                    <option value="">全部</option>
                </select>
            </span>
            <input type="submit" value="新增电子文档" />
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

            <c:forEach items="" var="">
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                    <a href="#">修改</a>
                    <a href="#">删除</a>
                </td>
            </tr>
            </c:forEach>

        </table>

    </form>

</div>

</body>
</html>
