import Vue from 'vue'
import Router from 'vue-router'
import Index from '@/components/index'
import Dept from '@/components/dept/list'
import Job from '@/components/job/list'
import Table from '@/components/table/newList'
import Quit from '@/components/table/quitList'
import Deptlist from '@/components/table/deptList'
import Joblist from '@/components/table/jobList'
import Reportlist from '@/components/table/reportList'
import Notice from '@/components/notice/list'
import Login from '@/components/login'



Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [{
    path: '/login',
    name: 'login',
    component: Login
  },
  {
    path: '/index',
    name: 'index',
    component: Index,
    children: [
      {
        path: '/dept',
        name: 'dept',
        component: Dept
      },
      {
        path: '/job',
        name: 'job',
        component: Job
      },
      {
        path: '/table',
        name: 'table',
        component: Table
      },
      {
        path: '/quit',
        name: 'quit',
        component: Quit
      },
      {
        path: '/deptlist',
        name: 'deptlist',
        component: Deptlist
      },
      {
        path: '/joblist',
        name: 'joblist',
        component: Joblist
      },
      {
        path: '/reportlist',
        name: 'reportlist',
        component: Reportlist
      },
      {
        path: '/notice',
        name: 'notice',
        component: Notice
      }
    ]
  }
  ]
})
