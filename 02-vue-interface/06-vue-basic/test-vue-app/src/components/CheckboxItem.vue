<script>
export default {
    name: 'CheckboxItem',
    // props: ['name', 'checked'],

    props: {
        id: [Number, String],
        name: String,
        checked: {
            type: Boolean,
            required: false,
            default: false,
        },
    },
};
</script>

<!-- 1. 옵션1 4개 배치하는 문제 -->
<!-- <template>
    <div class="CheckboxItem">
        <li><input type="checkbox" />옵션1</li>
    </div>
</template> -->

<!-- 2. 관심있는 K-POP 가수 문제 -->
<template>
    <div class="CheckboxItem">
        <input type="checkbox" :checked="checked" />{{ name }}
    </div>
</template>

<style scoped></style>
