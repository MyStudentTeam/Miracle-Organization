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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#myform").submit(function () {
            var title = $("#title").val();
            var categoryId = $("#categoryId").val();
            var date= /^[1-9][0-9]{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/ ;
            var createDate = $("#createDate").val();

            if(title=="" || title==null){
                alert("文档名称不能为空！");
                return false;
            }
            if(categoryId==0){
                alert("请选择分类！");
                return false;
            }
            if(createDate=="" || !date.test(createDate)){
                alert("上传日期格式不能为空，并格式必须为yyyy-MM-dd!");
                return false;
            }
        })
    })

</script>
<div style="width: 500px;">
    <form action="#" method="post">
        <table border="1px" cellspacing="0px" cellpadding="0px" width="500px">
            <tr>
                <td colspan="2" align="center" style="font-size: 26px;background-color: #CCF6CE">增加电子文档</td>
            </tr>
            <tr>
                <td>文档编号</td>
                <td><input type="hidden" value="" name="id" /></td>
            </tr>
            <tr>
                <td>文档名称<span style="color: red">(*)</span></td>
                <td><input type="text" name="title" id="title" value="" /></td>
            </tr>
            <tr>
                <td>文档分类：</td>
                <td>
                    <select name="categoryId"  id="categoryId">
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
                <td><input type="text" name="uploaduser" value="" /></td>
            </tr>
            <tr>
                <td>上传时间<span style="color: red">(*)</span></td>
                <td><input type="text" id="createDate" name="createDate" value="" />(yyyy-MM-dd)</td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="提交"/>
                    <input type="button" value="返回"  onclick="javascript:history.back(-1)" />
                </td>
            </tr>
        </table>
    </form>

</div>

</body>
</html>
