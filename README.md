#Font Replacer

Change all text in your android application with selected font

Usage
=====
Put your font (.ttf) file in assets folder.
On your Application class, add this inside onCreate():

```
Replacer replacer = FontReplacer.Build(getApplicationContext());
replacer.setDefaultFont("myfont.ttf");
replacer.applyFont();
```

If yout want to use your default font to another code, just use:

```
Typeface font = FontReplacer.getDefaultFont();
yourview.setTypeface(font);
```
thats it.
