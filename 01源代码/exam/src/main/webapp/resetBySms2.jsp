<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/25
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>找回密码2</title>
</head>
<body>
<form class="form-horizontal" role="form"  action="/stu/updateStuPassword" method="post">
    <div class="form-group">

        <div class="form-group">
            <label for="edit_customerName" class="col-sm-2 control-label">密码</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="edit_sName" placeholder="密码" name="sPassword" />
            </div>
        </div>
        <div class="form-group">
            <label for="edit_customerName" class="col-sm-2 control-label">确认密码</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="edit_sName" placeholder="确认密码" name="csPassword" />
            </div>
        </div>
        <span>${smg}</span>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">确认修改</button>
                <button type="reset" class="btn btn-default"class="text-right" >取消</button>
            </div>
        </div>
    </div>
</form>
</body>
</html>
