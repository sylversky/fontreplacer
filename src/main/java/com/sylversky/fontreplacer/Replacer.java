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

public interface Replacer {
    public void setDefaultFont(String defaultFontAsset);
    public void setBoldFont(String boldFontAsset);
    public void setItalicFont(String italicFontAsset);
    public void setBoldItalicFont(String boldItalicFontAsset);
    public void setLightFont(String lightFontAsset);
    public void setCondensedFont(String condensedFontAsset);
    public void setThinFont(String thinFontAsset);
    public void setMediumFont(String mediumFontAsset);

    public void applyFont();
}
