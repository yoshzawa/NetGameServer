<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>このサイトについて</title>
</head>
<body>
<p>このサイトは、平成29年度　システム開発Ⅲの課題のテスト用サーバーとして作成されました。<br />
現在、以下のURLでのアクセスが可能です</p>
<H2>ユーザーログイン</H2>
<a href="/Login">/Login</a>・・・アクセスエラー(ＩＤが指定されていない)<br />
<a href="/Login?id=5">/Login?id=5</a>・・・ＩＤ=5としてアクセス(内容は適当)<br />
<a href="/Login?id=ABC">/Login?id=ABC</a>・・・アクセスエラー(ＩＤが登録されていない)<br />

</body>
</html>