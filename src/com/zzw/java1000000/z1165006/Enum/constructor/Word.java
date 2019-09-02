package com.zzw.java1000000.z1165006.Enum.constructor;

/**
 * @author zhengzewang on 2019/3/30.
 */
public enum Word {

    hello("你好");

    private String caption;

    Word(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public static Word captionOf(String caption) {
        Word[] words = Word.values();
        for (Word word : words) {
            if (word.getCaption().equals(caption)) {
                return word;
            }
        }
        return null;
    }

}
