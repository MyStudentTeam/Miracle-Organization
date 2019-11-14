<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--
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
<div style="width: 500px;">
    <form action="/edocEntry/update" method="post">
        <table border="1px" cellspacing="0px" cellpadding="0px" width="500px">
            <tr>
                <td colspan="2" align="center" style="font-size: 26px;background-color: #CCF6CE">增加电子文档</td>
            </tr>
            <tr>
                <td>文档编号</td>
                <td>${edocEntry.id}<input type="hidden" value="${edocEntry.id}" name="id"/></td>
            </tr>
            <tr>
                <td>文档名称<span style="color: red">(*)</span></td>
                <td><input type="text" name="title" value="${edocEntry.title}"/></td>
            </tr>
            <tr>
                <td>文档分类：</td>
                <td>
                    <select name="categoryId">
                        <option value="">全部</option>
                        <c:forEach var="cat" items="${categoryList}">
                            <c:if test="${cat.id == edocEntry.categoryId}">
                                <option selected="selected" value="${cat.id}">${cat.name}</option>
                                <</c:if>
                            <c:if test="${cat.id!=edocEntry.categoryId}">
                                <option value="${cat.id}">${cat.name}</option>
                            </c:if>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>内容摘要</td>
                <td>
                    <textarea name="summary"
                              style="overflow-y:scroll;height: 50px;width: 300px">${edocEntry.summary}</textarea>
                </td>
            </tr>
            <tr>
                <td>上传人</td>
                <td><input type="text" name="uploaduser" value="${edocEntry.uploaduser}"/></td>
            </tr>
            <tr>
                <td>上传时间<span style="color: red">(*)</span></td>
                <td><input type="text" name="createDate" value="${edocEntry.time}"/>(yyyy-MM-dd)</td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="提交"/>
                    <input type="button" value="返回" onclick="javascript:history.back(-1)"/>
                </td>
            </tr>
        </table>
    </form>

</div>

</body>
</html>
