layui.use('table', function(){
    var table = layui.table;

    //方法级渲染
    table.render({
        elem: '#LAY_table_user'
        ,url: '/dept/ajaxList'
        ,cols: [[
            {checkbox: true, fixed: true}
            ,{field:'id', title: 'ID', width:80, sort: true, fixed: true}
        ]]
        ,id: 'testReload'
        ,page: true
        ,height: 315
    });

    var $ = layui.$, active = {
        reload: function(){
            var demoReload = $('#demoReload');

            //执行重载
            table.reload('testReload', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                    key: {
                        id: demoReload.val()
                    }
                }
            });
        }
    };

    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });
    $('#tanBtn').on('click', function(){
        $.post('/dept/save', {}, function(str){
            layer.open({
                area: ['500px', '300px'],
                type: 1,
                content: str //注意，如果str是object，那么需要字符拼接。
            });
        });
    });

});