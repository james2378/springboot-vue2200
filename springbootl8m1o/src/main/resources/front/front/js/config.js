
var projectName = '贸易行业crm系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '市场活动',
	url: './pages/shichanghuodong/list.html'
}, 
{
	name: '产品信息',
	url: './pages/chanpinxinxi/list.html'
}, 

{
	name: '企业公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootl8m1o/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"产品分类","menuJump":"列表","tableName":"chanpinfenlei"}],"menu":"产品分类管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除","报表"],"menu":"客户信息","menuJump":"列表","tableName":"kehuxinxi"}],"menu":"客户信息管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除"],"menu":"部门","menuJump":"列表","tableName":"bumen"}],"menu":"部门管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"市场活动","menuJump":"列表","tableName":"shichanghuodong"}],"menu":"市场活动管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"产品信息","menuJump":"列表","tableName":"chanpinxinxi"}],"menu":"产品信息管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","修改","删除","报表"],"menu":"销售订单","menuJump":"列表","tableName":"xiaoshoudingdan"}],"menu":"销售订单管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","修改","删除"],"menu":"配送订单","menuJump":"列表","tableName":"peisongdingdan"}],"menu":"配送订单管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除"],"menu":"售后回访","menuJump":"列表","tableName":"shouhouhuifang"}],"menu":"售后回访管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"企业公告","tableName":"news"},{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"市场活动列表","menuJump":"列表","tableName":"shichanghuodong"}],"menu":"市场活动模块"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"产品信息列表","menuJump":"列表","tableName":"chanpinxinxi"}],"menu":"产品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"客户信息","menuJump":"列表","tableName":"kehuxinxi"}],"menu":"客户信息管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","销售订单"],"menu":"产品信息","menuJump":"列表","tableName":"chanpinxinxi"}],"menu":"产品信息管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","修改","删除","报表","配送"],"menu":"销售订单","menuJump":"列表","tableName":"xiaoshoudingdan"}],"menu":"销售订单管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","修改","删除","回访"],"menu":"配送订单","menuJump":"列表","tableName":"peisongdingdan"}],"menu":"配送订单管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除"],"menu":"售后回访","menuJump":"列表","tableName":"shouhouhuifang"}],"menu":"售后回访管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"市场活动列表","menuJump":"列表","tableName":"shichanghuodong"}],"menu":"市场活动模块"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"产品信息列表","menuJump":"列表","tableName":"chanpinxinxi"}],"menu":"产品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"员工","tableName":"yuangong"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
