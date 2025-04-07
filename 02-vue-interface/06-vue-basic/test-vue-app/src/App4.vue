<script>
import InputName from './components/InputName.vue';

export default {
    name: 'App4',
    components: { InputName },
    data() {
        return {
            name: '',
        };
    },
    methods: {
        nameChangedHandler(e) {
            this.name = e.name;
        },
    },
};
</script>

<template>
    <div>
        <InputName @nameChanged="nameChangedHandler" />
        <h3>App 데이터 : {{ name }}</h3>
    </div>
</template>

<style scoped></style>
