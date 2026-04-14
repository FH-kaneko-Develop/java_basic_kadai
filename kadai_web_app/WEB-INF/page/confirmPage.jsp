<%@ page contentType="text/html; charset=UTF-8" %>

<html>
    <head>
        <title>確認画面</title>
    </head>
    <body>
        <h1>入力内容をご確認ください。</h1>
        <p>問題なければ「確定」、修正する場合は「キャンセル」をクリックしてください。</p>
        <table border="1">
            <tr>
                <th>項目</th>
                <th>入力内容</th>
            </tr>
            <tr>
                <td>氏名</td>
                <td>${name}</td>
            </tr>
            <tr>
                <td>メールアドレス</td>
                <td>${email}</td>
            </tr>
            <tr>
                <td>住所</td>
                <td>${address}</td>
            </tr>
            <tr>
                <td>電話番号</td>
                <td>${phone_number}</td>
            </tr>
        </table>
        <p>
            <button onclick="location.href='<%= request.getContextPath() %>/complete';">確定</button>
            <button onclick="history.back();">キャンセル</button>
        </p>
    </body>
</html>
