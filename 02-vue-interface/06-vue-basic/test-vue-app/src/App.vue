<script>
import CheckboxItem from './components/CheckboxItem.vue';

export default {
    name: 'App',
    components: { CheckboxItem },
    data() {
        return {
            idols: [
                { id: 1, name: 'BTS', checked: true },
                { id: 2, name: 'Black Pink', checked: false },
                { id: 3, name: 'EXO', checked: false },
                { id: 4, name: 'ITZY', checked: false },
            ],
        };
    },
};
</script>

<template>
    <div>
        <h2>App 컴포넌트</h2>
        <hr />
        <ul>
            <li v-for="idol in idols" :key="idol.id">
                <CheckboxItem :name="idol.name" :checked="idol.checked" />
            </li>
        </ul>
    </div>
</template>

<style scoped></style>
