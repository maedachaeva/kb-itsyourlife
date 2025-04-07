import { createRouter, createWebHistory } from 'vue-router';

import Home from '@/pages/Home.vue';
import About from '@/pages/About.vue';
import Members from '@/pages/Members.vue';
import MemberInfo from '@/pages/MemberInfo.vue';

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', component: Home },
    { path: '/about', component: About }, // 경로가 about으로 들어오면 About 페이지를 보여주고
    { path: '/members', component: Members },
    { path: '/members/:id(\\d+)', component: MemberInfo },
  ],
});

export default router;
