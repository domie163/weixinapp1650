import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import leixing from '@/views/modules/leixing/list'
    import news from '@/views/modules/news/list'
    import cehuashi from '@/views/modules/cehuashi/list'
    import discusshunqingcehua from '@/views/modules/discusshunqingcehua/list'
    import hunqingcehua from '@/views/modules/hunqingcehua/list'
    import discusshunshazhao from '@/views/modules/discusshunshazhao/list'
    import dingzhixinxi from '@/views/modules/dingzhixinxi/list'
    import paisheyuyue from '@/views/modules/paisheyuyue/list'
    import discussdingzhixinxi from '@/views/modules/discussdingzhixinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import hunshazhao from '@/views/modules/hunshazhao/list'
    import yonghu from '@/views/modules/yonghu/list'
    import hunqingyuyue from '@/views/modules/hunqingyuyue/list'
    import config from '@/views/modules/config/list'
    import yifudingzhi from '@/views/modules/yifudingzhi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/leixing',
        name: '类型',
        component: leixing
      }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/cehuashi',
        name: '策划师',
        component: cehuashi
      }
      ,{
	path: '/discusshunqingcehua',
        name: '婚庆策划评论',
        component: discusshunqingcehua
      }
      ,{
	path: '/hunqingcehua',
        name: '婚庆策划',
        component: hunqingcehua
      }
      ,{
	path: '/discusshunshazhao',
        name: '婚纱照评论',
        component: discusshunshazhao
      }
      ,{
	path: '/dingzhixinxi',
        name: '定制信息',
        component: dingzhixinxi
      }
      ,{
	path: '/paisheyuyue',
        name: '拍摄预约',
        component: paisheyuyue
      }
      ,{
	path: '/discussdingzhixinxi',
        name: '定制信息评论',
        component: discussdingzhixinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/hunshazhao',
        name: '婚纱照',
        component: hunshazhao
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/hunqingyuyue',
        name: '婚庆预约',
        component: hunqingyuyue
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/yifudingzhi',
        name: '衣服定制',
        component: yifudingzhi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
