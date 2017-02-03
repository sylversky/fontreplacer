/*
 * Copyright (C) 2017 Leonardus Ardyandhita.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sylversky.fontreplacer;

import android.content.Context;
import android.graphics.Typeface;

public class FontReplacer {
    protected static Typeface defaultFont;
    protected static Typeface boldFont;
    protected static Typeface italicFont;
    protected static Typeface boldItalicFont;
    protected static Typeface lightFont;
    protected static Typeface condensedFont;
    protected static Typeface thinFont;
    protected static Typeface mediumFont;

    public static Replacer Build(Context context){
        Replacer replacer = new ReplacerImpl(context);
        return replacer;
    }

    public static Typeface getDefaultFont() {
        return defaultFont;
    }

    public static Typeface getBoldFont() {
        return boldFont;
    }

    public static Typeface getItalicFont() {
        return italicFont;
    }

    public static Typeface getBoldItalicFont() {
        return boldItalicFont;
    }

    public static Typeface getLightFont() {
        return lightFont;
    }

    public static Typeface getCondensedFont() {
        return condensedFont;
    }

    public static Typeface getThinFont() {
        return thinFont;
    }

    public static Typeface getMediumFont() {
        return mediumFont;
    }
}
