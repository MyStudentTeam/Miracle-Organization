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
<div style="width: 500px;">
    <form action="#" method="post">
        <table border="1px" cellspacing="0px" cellpadding="0px" width="500px">
            <tr>
                <td colspan="2" align="center" style="font-size: 26px;background-color: #CCF6CE">增加电子文档</td>
            </tr>
            <tr>
                <td>文档名称<span style="color: red">(*)</span></td>
                <td><input type="text" name="title" /></td>
            </tr>
            <tr>
                <td>文档分类：</td>
                <td>
                    <select name="categoryId">
                        <option value="">全部</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>内容摘要</td>
                <td>
                    <textarea name="summary" style="overflow-y:scroll;height: 50px;width: 300px"></textarea>
                </td>
            </tr>
            <tr>
                <td>上传人</td>
                <td><input type="text" name="uploaduser" /></td>
            </tr>
            <tr>
                <td>上传时间<span style="color: red">(*)</span></td>
                <td><input type="text" name="createDate" />(yyyy-MM-dd)</td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交"/>
                    <input type="button" value="返回"  onclick="javascript:history.back(-1)" />
                </td>
            </tr>
        </table>
    </form>

</div>

</body>
</html>
