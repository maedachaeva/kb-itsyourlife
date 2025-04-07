<script>
export default {
    name: 'InputName',
    emits: {
        nameChanged: (e) => {
            return e.name &&
                typeof e.name === 'string' &&
                e.name.trim().length >= 3
                ? true
                : false;
        },
    },
    data() {
        return {
            name: '',
        };
    },
};
</script>

<template>
    <div>
        <label>이름:</label>
        <input type="text" v-model="name" />
        <button @click="$emit('nameChanged', { name })">이벤트 발신</button>
    </div>
</template>

<style scoped></style>
