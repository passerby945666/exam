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
    <title>找回密码1验证身份</title>
</head>
<body>
<div >
    <div style="text-align: center">
        <h3>忘记密码了怎么办——1、验证身份</h3>
    </div>
    <div style=" position: absolute;border: 1px solid #333333;border-radius: 5px ;padding-left:100px;padding-top:20px;padding-bottom: 20px;margin-left: 15%;width: 400px">
        <form action="/stu/forgetStuPassword" method="post">
            <table style="text-align-last: left">
                <tr>
                    <th>账号：</th>
                    <th><input type="text" PLACEHOLDER="请输入您的账号" required name="sNo"></th>
                </tr>
                <br>
                <tr>
                    <th></th>
                    <th></th>
                </tr>
                <tr>
                    <th>身份证号码：</th>
                    <th><input type="text" PLACEHOLDER="请输入您的身份证号码" required name="sIdcard"></th>
                </tr>
            </table>
            <br>
            <div style="float: left;">
                <button type="submit" class="btn btn-default">确认修改</button>
                <button type="reset" class="btn btn-default"class="text-right" >取消</button>
            </div>
            <div style="float: right;margin-right: 20px">
                <span>${smg}</span>
            </div>
        </form>
    </div>
</form>
</div>
</body>
</html>
