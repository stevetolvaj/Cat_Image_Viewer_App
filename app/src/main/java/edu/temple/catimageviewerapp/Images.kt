package edu.temple.catimageviewerapp

import android.content.res.Resources


fun imageList(resources: Resources): List<ImageObject> {
    return listOf(
        ImageObject(
            id = 0,
            title = resources.getStringArray(R.array.cat_descriptions)[0],
            resourceId = R.drawable.meowing_cat
        ),
        ImageObject(
            id = 1,
            title = resources.getStringArray(R.array.cat_descriptions)[1],
            resourceId = R.drawable.sleeping_cat
        ),
        ImageObject(
            id = 2,
            title = resources.getStringArray(R.array.cat_descriptions)[2],
            resourceId = R.drawable.playful_waving_cat
        ),
        ImageObject(
            id = 3,
            title = resources.getStringArray(R.array.cat_descriptions)[3],
            resourceId = R.drawable.orange_sidewalk_cat
        ),
        ImageObject(
            id = 4,
            title = resources.getStringArray(R.array.cat_descriptions)[4],
            resourceId = R.drawable.yawning_cat
        ),
        ImageObject(
            id = 5,
            title = resources.getStringArray(R.array.cat_descriptions)[5],
            resourceId = R.drawable.green_eyed_cat
        ),
        ImageObject(
            id = 6,
            title = resources.getStringArray(R.array.cat_descriptions)[6],
            resourceId = R.drawable.white_and_orange_cat
        ),
        ImageObject(
            id = 7,
            title = resources.getStringArray(R.array.cat_descriptions)[7],
            resourceId = R.drawable.two_kittens_sitting_on_box
        ),
        ImageObject(
            id = 8,
            title = resources.getStringArray(R.array.cat_descriptions)[8],
            resourceId = R.drawable.white_cat_on_bed
        ),
        ImageObject(
            id = 9,
            title = resources.getStringArray(R.array.cat_descriptions)[9],
            resourceId = R.drawable.kitten_scratching_post
        ),
        ImageObject(
            id = 10,
            title = resources.getStringArray(R.array.cat_descriptions)[10],
            resourceId = R.drawable.white_orange_licking_cat
        ),
        ImageObject(
            id = 11,
            title = resources.getStringArray(R.array.cat_descriptions)[11],
            resourceId = R.drawable.tuxedo_cat_with_crown
        ),
        ImageObject(
            id = 0,
            title = resources.getStringArray(R.array.cat_descriptions)[0],
            resourceId = R.drawable.meowing_cat
        ),
        ImageObject(
            id = 1,
            title = resources.getStringArray(R.array.cat_descriptions)[1],
            resourceId = R.drawable.sleeping_cat
        ),
        ImageObject(
            id = 2,
            title = resources.getStringArray(R.array.cat_descriptions)[2],
            resourceId = R.drawable.playful_waving_cat
        ),
        ImageObject(
            id = 3,
            title = resources.getStringArray(R.array.cat_descriptions)[3],
            resourceId = R.drawable.orange_sidewalk_cat
        ),
        ImageObject(
            id = 4,
            title = resources.getStringArray(R.array.cat_descriptions)[4],
            resourceId = R.drawable.yawning_cat
        ),
        ImageObject(
            id = 5,
            title = resources.getStringArray(R.array.cat_descriptions)[5],
            resourceId = R.drawable.green_eyed_cat
        ),
        ImageObject(
            id = 6,
            title = resources.getStringArray(R.array.cat_descriptions)[6],
            resourceId = R.drawable.white_and_orange_cat
        ),
        ImageObject(
            id = 7,
            title = resources.getStringArray(R.array.cat_descriptions)[7],
            resourceId = R.drawable.two_kittens_sitting_on_box
        ),
        ImageObject(
            id = 8,
            title = resources.getStringArray(R.array.cat_descriptions)[8],
            resourceId = R.drawable.white_cat_on_bed
        ),
        ImageObject(
            id = 9,
            title = resources.getStringArray(R.array.cat_descriptions)[9],
            resourceId = R.drawable.kitten_scratching_post
        ),
        ImageObject(
            id = 10,
            title = resources.getStringArray(R.array.cat_descriptions)[10],
            resourceId = R.drawable.white_orange_licking_cat
        ),
        ImageObject(
            id = 11,
            title = resources.getStringArray(R.array.cat_descriptions)[11],
            resourceId = R.drawable.tuxedo_cat_with_crown
        )
    )
}