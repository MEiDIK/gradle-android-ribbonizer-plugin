package com.github.gfx.ribbonizer;

import com.android.build.gradle.api.ApplicationVariant;
import com.github.gfx.ribbonizer.filter.ColorRibbonFilter;

import org.gradle.api.Action;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GreenRibbonBuilder implements FilterBuilder {

    @Override
    public Action<BufferedImage> apply(ApplicationVariant variant) {
        return new ColorRibbonFilter(variant.getBuildType().getName(), new Color(0, 0x72, 0, 0xaa));
    }
}
