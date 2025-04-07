import { createApp } from 'vue';

// import App from './App.vue';
// import App from './App2.vue';
import App from './App4.vue';

// import CheckboxItem from './components/CheckboxItem.vue';
// import CheckboxItem from './components/CheckboxItem2.vue';
import CheckboxItem from './components/InputName.vue';

createApp(App).component('CheckboxItem', CheckboxItem).mount('#app');
