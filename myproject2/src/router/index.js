import Vue from 'vue'
import Router from 'vue-router'
import Index from '@/components/index'
import Dept from '@/components/dept/list'
import Job from '@/components/job/list'
import Emp from '@/components/emp/list'
import Career from '@/components/career/list'
import Foreign_Languages from '@/components/foreign_languages/list'
import Family from '@/components/family/list'

Vue.use(Router)

export default new Router({
  mode:'history',
  routes: [
    {
        path:'/index',
        name:'index',
        component:Index,
        children:[
          {
            path:'/dept',
            name:'dept',
            component:Dept
          },
          {
            path:'/job',
            name:'job',
            component:Job
          },
          {
            path:'/emp',
            name:'emp',
            component:Emp
          },
          {
            path:'/career',
            name:'career',
            component:Career
          },
          {
            path:'/foreign_languages',
            name:'foreign_languages',
            component:Foreign_Languages
          },
          {
            path:'/family',
            name:'family',
            component:Family
          }
        ]
    }
  ]
})
