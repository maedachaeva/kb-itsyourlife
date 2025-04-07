<script>
export default {
    name: 'CheckboxItem',
    props: ['idol'],
};
</script>

<template>
    <div class="CheckboxItem">
        <input type="checkbox" :checked="idol.checked" />{{ idol.name }}
    </div>
</template>

<style scoped></style>
