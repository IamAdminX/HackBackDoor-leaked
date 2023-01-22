/*
 * Decompiled with CFR 0.150.
 */
package me.system.runner.utils;

import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;

public class DWeb {
    private /* synthetic */ String username;
    private /* synthetic */ boolean tts;
    private /* synthetic */ String avatarUrl;
    private /* synthetic */ List<EmbedObject> embeds;
    private final /* synthetic */ String url;
    private /* synthetic */ String content;

    public void setAvatarUrl(String lllllllllllllllllIllllIIllIlIlII) {
        lllllllllllllllllIllllIIllIlIlIl.avatarUrl = lllllllllllllllllIllllIIllIlIlII;
    }

    public void setTts(boolean lllllllllllllllllIllllIIllIlIIII) {
        lllllllllllllllllIllllIIllIIllll.tts = lllllllllllllllllIllllIIllIlIIII;
    }

    public void setContent(String lllllllllllllllllIllllIIlllIIIII) {
        lllllllllllllllllIllllIIlllIIIll.content = lllllllllllllllllIllllIIlllIIIII;
    }

    public void execute() throws IOException {
        DWeb lllllllllllllllllIllllIIlIlIIlll;
        if (lllllllllllllllllIllllIIlIlIIlll.content == null && lllllllllllllllllIllllIIlIlIIlll.embeds.isEmpty()) {
            throw new IllegalArgumentException("Set content or add at least one EmbedObject");
        }
        JSONObject lllllllllllllllllIllllIIlIlIIllI = lllllllllllllllllIllllIIlIlIIlll.new JSONObject();
        lllllllllllllllllIllllIIlIlIIllI.put("content", lllllllllllllllllIllllIIlIlIIlll.content);
        lllllllllllllllllIllllIIlIlIIllI.put("username", lllllllllllllllllIllllIIlIlIIlll.username);
        lllllllllllllllllIllllIIlIlIIllI.put("avatar_url", lllllllllllllllllIllllIIlIlIIlll.avatarUrl);
        lllllllllllllllllIllllIIlIlIIllI.put("tts", lllllllllllllllllIllllIIlIlIIlll.tts);
        if (!lllllllllllllllllIllllIIlIlIIlll.embeds.isEmpty()) {
            ArrayList<JSONObject> lllllllllllllllllIllllIIlIlIlIII = new ArrayList<JSONObject>();
            for (EmbedObject lllllllllllllllllIllllIIlIlIlIIl : lllllllllllllllllIllllIIlIlIIlll.embeds) {
                JSONObject lllllllllllllllllIllllIIlIllIIII = lllllllllllllllllIllllIIlIlIIlll.new JSONObject();
                lllllllllllllllllIllllIIlIllIIII.put("title", lllllllllllllllllIllllIIlIlIlIIl.getTitle());
                lllllllllllllllllIllllIIlIllIIII.put("description", lllllllllllllllllIllllIIlIlIlIIl.getDescription());
                lllllllllllllllllIllllIIlIllIIII.put("url", lllllllllllllllllIllllIIlIlIlIIl.getUrl());
                if (lllllllllllllllllIllllIIlIlIlIIl.getColor() != null) {
                    Color lllllllllllllllllIllllIIlIlllIII = lllllllllllllllllIllllIIlIlIlIIl.getColor();
                    int lllllllllllllllllIllllIIlIllIlll = lllllllllllllllllIllllIIlIlllIII.getRed();
                    lllllllllllllllllIllllIIlIllIlll = (lllllllllllllllllIllllIIlIllIlll << 8) + lllllllllllllllllIllllIIlIlllIII.getGreen();
                    lllllllllllllllllIllllIIlIllIlll = (lllllllllllllllllIllllIIlIllIlll << 8) + lllllllllllllllllIllllIIlIlllIII.getBlue();
                    lllllllllllllllllIllllIIlIllIIII.put("color", lllllllllllllllllIllllIIlIllIlll);
                }
                EmbedObject.Footer lllllllllllllllllIllllIIlIlIllll = lllllllllllllllllIllllIIlIlIlIIl.getFooter();
                EmbedObject.Image lllllllllllllllllIllllIIlIlIlllI = lllllllllllllllllIllllIIlIlIlIIl.getImage();
                EmbedObject.Thumbnail lllllllllllllllllIllllIIlIlIllIl = lllllllllllllllllIllllIIlIlIlIIl.getThumbnail();
                EmbedObject.Author lllllllllllllllllIllllIIlIlIllII = lllllllllllllllllIllllIIlIlIlIIl.getAuthor();
                List<EmbedObject.Field> lllllllllllllllllIllllIIlIlIlIll = lllllllllllllllllIllllIIlIlIlIIl.getFields();
                if (lllllllllllllllllIllllIIlIlIllll != null) {
                    JSONObject lllllllllllllllllIllllIIlIllIllI = lllllllllllllllllIllllIIlIlIIlll.new JSONObject();
                    lllllllllllllllllIllllIIlIllIllI.put("text", lllllllllllllllllIllllIIlIlIllll.getText());
                    lllllllllllllllllIllllIIlIllIllI.put("icon_url", lllllllllllllllllIllllIIlIlIllll.getIconUrl());
                    lllllllllllllllllIllllIIlIllIIII.put("footer", lllllllllllllllllIllllIIlIllIllI);
                }
                if (lllllllllllllllllIllllIIlIlIlllI != null) {
                    JSONObject lllllllllllllllllIllllIIlIllIlIl = lllllllllllllllllIllllIIlIlIIlll.new JSONObject();
                    lllllllllllllllllIllllIIlIllIlIl.put("url", lllllllllllllllllIllllIIlIlIlllI.getUrl());
                    lllllllllllllllllIllllIIlIllIIII.put("image", lllllllllllllllllIllllIIlIllIlIl);
                }
                if (lllllllllllllllllIllllIIlIlIllIl != null) {
                    JSONObject lllllllllllllllllIllllIIlIllIlII = lllllllllllllllllIllllIIlIlIIlll.new JSONObject();
                    lllllllllllllllllIllllIIlIllIlII.put("url", lllllllllllllllllIllllIIlIlIllIl.getUrl());
                    lllllllllllllllllIllllIIlIllIIII.put("thumbnail", lllllllllllllllllIllllIIlIllIlII);
                }
                if (lllllllllllllllllIllllIIlIlIllII != null) {
                    JSONObject lllllllllllllllllIllllIIlIllIIll = lllllllllllllllllIllllIIlIlIIlll.new JSONObject();
                    lllllllllllllllllIllllIIlIllIIll.put("name", lllllllllllllllllIllllIIlIlIllII.getName());
                    lllllllllllllllllIllllIIlIllIIll.put("url", lllllllllllllllllIllllIIlIlIllII.getUrl());
                    lllllllllllllllllIllllIIlIllIIll.put("icon_url", lllllllllllllllllIllllIIlIlIllII.getIconUrl());
                    lllllllllllllllllIllllIIlIllIIII.put("author", lllllllllllllllllIllllIIlIllIIll);
                }
                ArrayList<JSONObject> lllllllllllllllllIllllIIlIlIlIlI = new ArrayList<JSONObject>();
                for (EmbedObject.Field lllllllllllllllllIllllIIlIllIIIl : lllllllllllllllllIllllIIlIlIlIll) {
                    JSONObject lllllllllllllllllIllllIIlIllIIlI = lllllllllllllllllIllllIIlIlIIlll.new JSONObject();
                    lllllllllllllllllIllllIIlIllIIlI.put("name", lllllllllllllllllIllllIIlIllIIIl.getName());
                    lllllllllllllllllIllllIIlIllIIlI.put("value", lllllllllllllllllIllllIIlIllIIIl.getValue());
                    lllllllllllllllllIllllIIlIllIIlI.put("inline", lllllllllllllllllIllllIIlIllIIIl.isInline());
                    lllllllllllllllllIllllIIlIlIlIlI.add(lllllllllllllllllIllllIIlIllIIlI);
                }
                lllllllllllllllllIllllIIlIllIIII.put("fields", lllllllllllllllllIllllIIlIlIlIlI.toArray());
                lllllllllllllllllIllllIIlIlIlIII.add(lllllllllllllllllIllllIIlIllIIII);
            }
            lllllllllllllllllIllllIIlIlIIllI.put("embeds", lllllllllllllllllIllllIIlIlIlIII.toArray());
        }
        URL lllllllllllllllllIllllIIlIlIIlIl = new URL(lllllllllllllllllIllllIIlIlIIlll.url);
        HttpsURLConnection lllllllllllllllllIllllIIlIlIIlII = (HttpsURLConnection)lllllllllllllllllIllllIIlIlIIlIl.openConnection();
        lllllllllllllllllIllllIIlIlIIlII.addRequestProperty("Content-Type", "application/json");
        lllllllllllllllllIllllIIlIlIIlII.addRequestProperty("User-Agent", "Spigot-Stats-Server");
        lllllllllllllllllIllllIIlIlIIlII.setDoOutput(true);
        lllllllllllllllllIllllIIlIlIIlII.setRequestMethod("POST");
        OutputStream lllllllllllllllllIllllIIlIlIIIll = lllllllllllllllllIllllIIlIlIIlII.getOutputStream();
        lllllllllllllllllIllllIIlIlIIIll.write(lllllllllllllllllIllllIIlIlIIllI.toString().getBytes());
        lllllllllllllllllIllllIIlIlIIIll.flush();
        lllllllllllllllllIllllIIlIlIIIll.close();
        lllllllllllllllllIllllIIlIlIIlII.getInputStream().close();
        lllllllllllllllllIllllIIlIlIIlII.disconnect();
    }

    public void addEmbed(EmbedObject lllllllllllllllllIllllIIllIIlIlI) {
        DWeb lllllllllllllllllIllllIIllIIlIIl;
        lllllllllllllllllIllllIIllIIlIIl.embeds.add(lllllllllllllllllIllllIIllIIlIlI);
    }

    public void setUsername(String lllllllllllllllllIllllIIllIllIlI) {
        lllllllllllllllllIllllIIllIllIll.username = lllllllllllllllllIllllIIllIllIlI;
    }

    public DWeb(String lllllllllllllllllIllllIIlllIIllI) {
        DWeb lllllllllllllllllIllllIIlllIlIIl;
        lllllllllllllllllIllllIIlllIlIIl.embeds = new ArrayList<EmbedObject>();
        lllllllllllllllllIllllIIlllIlIIl.url = lllllllllllllllllIllllIIlllIIllI;
    }

    public static class EmbedObject {
        private /* synthetic */ Thumbnail thumbnail;
        private /* synthetic */ String url;
        private /* synthetic */ String description;
        private /* synthetic */ List<Field> fields;
        private /* synthetic */ Author author;
        private /* synthetic */ Footer footer;
        private /* synthetic */ Color color;
        private /* synthetic */ Image image;
        private /* synthetic */ String title;

        public EmbedObject setImage(String llllllllllllllIIIIIIIlIlIIIlllII) {
            EmbedObject llllllllllllllIIIIIIIlIlIIIlllll;
            llllllllllllllIIIIIIIlIlIIIlllll.image = llllllllllllllIIIIIIIlIlIIIlllll.new Image(llllllllllllllIIIIIIIlIlIIIlllII);
            return llllllllllllllIIIIIIIlIlIIIlllll;
        }

        public EmbedObject setThumbnail(String llllllllllllllIIIIIIIlIlIIlIIIlI) {
            EmbedObject llllllllllllllIIIIIIIlIlIIlIIIll;
            llllllllllllllIIIIIIIlIlIIlIIIll.thumbnail = llllllllllllllIIIIIIIlIlIIlIIIll.new Thumbnail(llllllllllllllIIIIIIIlIlIIlIIIlI);
            return llllllllllllllIIIIIIIlIlIIlIIIll;
        }

        public Color getColor() {
            EmbedObject llllllllllllllIIIIIIIlIlIlIllIII;
            return llllllllllllllIIIIIIIlIlIlIllIII.color;
        }

        public EmbedObject() {
            EmbedObject llllllllllllllIIIIIIIlIlIllIIlII;
            llllllllllllllIIIIIIIlIlIllIIlII.fields = new ArrayList<Field>();
        }

        public EmbedObject setColor(Color llllllllllllllIIIIIIIlIlIIllIIll) {
            EmbedObject llllllllllllllIIIIIIIlIlIIllIlII;
            llllllllllllllIIIIIIIlIlIIllIlII.color = llllllllllllllIIIIIIIlIlIIllIIll;
            return llllllllllllllIIIIIIIlIlIIllIlII;
        }

        public EmbedObject addField(String llllllllllllllIIIIIIIlIlIIIIlIlI, String llllllllllllllIIIIIIIlIlIIIIlIIl, boolean llllllllllllllIIIIIIIlIlIIIIIlII) {
            EmbedObject llllllllllllllIIIIIIIlIlIIIIlIll;
            llllllllllllllIIIIIIIlIlIIIIlIll.fields.add(llllllllllllllIIIIIIIlIlIIIIlIll.new Field(llllllllllllllIIIIIIIlIlIIIIlIlI, llllllllllllllIIIIIIIlIlIIIIlIIl, llllllllllllllIIIIIIIlIlIIIIIlII));
            return llllllllllllllIIIIIIIlIlIIIIlIll;
        }

        public EmbedObject setFooter(String llllllllllllllIIIIIIIlIlIIlIlIIl, String llllllllllllllIIIIIIIlIlIIlIlIII) {
            EmbedObject llllllllllllllIIIIIIIlIlIIlIllIl;
            llllllllllllllIIIIIIIlIlIIlIllIl.footer = llllllllllllllIIIIIIIlIlIIlIllIl.new Footer(llllllllllllllIIIIIIIlIlIIlIlIIl, llllllllllllllIIIIIIIlIlIIlIlIII);
            return llllllllllllllIIIIIIIlIlIIlIllIl;
        }

        public EmbedObject setTitle(String llllllllllllllIIIIIIIlIlIlIIIlIl) {
            EmbedObject llllllllllllllIIIIIIIlIlIlIIIllI;
            llllllllllllllIIIIIIIlIlIlIIIllI.title = llllllllllllllIIIIIIIlIlIlIIIlIl;
            return llllllllllllllIIIIIIIlIlIlIIIllI;
        }

        public Footer getFooter() {
            EmbedObject llllllllllllllIIIIIIIlIlIlIlIllI;
            return llllllllllllllIIIIIIIlIlIlIlIllI.footer;
        }

        public Thumbnail getThumbnail() {
            EmbedObject llllllllllllllIIIIIIIlIlIlIlIIll;
            return llllllllllllllIIIIIIIlIlIlIlIIll.thumbnail;
        }

        public EmbedObject setAuthor(String llllllllllllllIIIIIIIlIlIIIlIIlI, String llllllllllllllIIIIIIIlIlIIIlIIIl, String llllllllllllllIIIIIIIlIlIIIlIIII) {
            EmbedObject llllllllllllllIIIIIIIlIlIIIlIlll;
            llllllllllllllIIIIIIIlIlIIIlIlll.author = llllllllllllllIIIIIIIlIlIIIlIlll.new Author(llllllllllllllIIIIIIIlIlIIIlIIlI, llllllllllllllIIIIIIIlIlIIIlIIIl, llllllllllllllIIIIIIIlIlIIIlIIII);
            return llllllllllllllIIIIIIIlIlIIIlIlll;
        }

        public Image getImage() {
            EmbedObject llllllllllllllIIIIIIIlIlIlIIllll;
            return llllllllllllllIIIIIIIlIlIlIIllll.image;
        }

        public EmbedObject setDescription(String llllllllllllllIIIIIIIlIlIIllllIl) {
            EmbedObject llllllllllllllIIIIIIIlIlIIlllllI;
            llllllllllllllIIIIIIIlIlIIlllllI.description = llllllllllllllIIIIIIIlIlIIllllIl;
            return llllllllllllllIIIIIIIlIlIIlllllI;
        }

        public EmbedObject setUrl(String llllllllllllllIIIIIIIlIlIIlllIIl) {
            EmbedObject llllllllllllllIIIIIIIlIlIIlllIlI;
            llllllllllllllIIIIIIIlIlIIlllIlI.url = llllllllllllllIIIIIIIlIlIIlllIIl;
            return llllllllllllllIIIIIIIlIlIIlllIlI;
        }

        public Author getAuthor() {
            EmbedObject llllllllllllllIIIIIIIlIlIlIIllII;
            return llllllllllllllIIIIIIIlIlIlIIllII.author;
        }

        public String getUrl() {
            EmbedObject llllllllllllllIIIIIIIlIlIlIlllII;
            return llllllllllllllIIIIIIIlIlIlIlllII.url;
        }

        public List<Field> getFields() {
            EmbedObject llllllllllllllIIIIIIIlIlIlIIlIlI;
            return llllllllllllllIIIIIIIlIlIlIIlIlI.fields;
        }

        public String getDescription() {
            EmbedObject llllllllllllllIIIIIIIlIlIlIllllI;
            return llllllllllllllIIIIIIIlIlIlIllllI.description;
        }

        public String getTitle() {
            EmbedObject llllllllllllllIIIIIIIlIlIllIIIIl;
            return llllllllllllllIIIIIIIlIlIllIIIIl.title;
        }

        private class Footer {
            private /* synthetic */ String iconUrl;
            private /* synthetic */ String text;

            private String getText() {
                Footer llllllllllllllIllllllIIIlIllIIll;
                return llllllllllllllIllllllIIIlIllIIll.text;
            }

            private String getIconUrl() {
                Footer llllllllllllllIllllllIIIlIllIIIl;
                return llllllllllllllIllllllIIIlIllIIIl.iconUrl;
            }

            private Footer(String llllllllllllllIllllllIIIlIlllIll, String llllllllllllllIllllllIIIlIllIllI) {
                Footer llllllllllllllIllllllIIIlIllllII;
                llllllllllllllIllllllIIIlIllllII.text = llllllllllllllIllllllIIIlIlllIll;
                llllllllllllllIllllllIIIlIllllII.iconUrl = llllllllllllllIllllllIIIlIllIllI;
            }
        }

        private class Field {
            private /* synthetic */ boolean inline;
            private /* synthetic */ String name;
            private /* synthetic */ String value;

            private String getName() {
                Field llllllllllllllllIllIlllIIlIIllII;
                return llllllllllllllllIllIlllIIlIIllII.name;
            }

            private boolean isInline() {
                Field llllllllllllllllIllIlllIIlIIIllI;
                return llllllllllllllllIllIlllIIlIIIllI.inline;
            }

            private Field(String llllllllllllllllIllIlllIIlIlIlIl, String llllllllllllllllIllIlllIIlIlIlII, boolean llllllllllllllllIllIlllIIlIlIIll) {
                Field llllllllllllllllIllIlllIIlIlIIlI;
                llllllllllllllllIllIlllIIlIlIIlI.name = llllllllllllllllIllIlllIIlIlIlIl;
                llllllllllllllllIllIlllIIlIlIIlI.value = llllllllllllllllIllIlllIIlIlIlII;
                llllllllllllllllIllIlllIIlIlIIlI.inline = llllllllllllllllIllIlllIIlIlIIll;
            }

            private String getValue() {
                Field llllllllllllllllIllIlllIIlIIlIIl;
                return llllllllllllllllIllIlllIIlIIlIIl.value;
            }
        }

        private class Thumbnail {
            private /* synthetic */ String url;

            private Thumbnail(String lllllllllllllIlIIIIIllIlIlllIlll) {
                Thumbnail lllllllllllllIlIIIIIllIlIllllIIl;
                lllllllllllllIlIIIIIllIlIllllIIl.url = lllllllllllllIlIIIIIllIlIlllIlll;
            }

            private String getUrl() {
                Thumbnail lllllllllllllIlIIIIIllIlIlllIlII;
                return lllllllllllllIlIIIIIllIlIlllIlII.url;
            }
        }

        private class Image {
            private /* synthetic */ String url;

            private Image(String llllllllllllllIllIlIlllllIllIIll) {
                Image llllllllllllllIllIlIlllllIllIlII;
                llllllllllllllIllIlIlllllIllIlII.url = llllllllllllllIllIlIlllllIllIIll;
            }

            private String getUrl() {
                Image llllllllllllllIllIlIlllllIlIIlIl;
                return llllllllllllllIllIlIlllllIlIIlIl.url;
            }
        }

        private class Author {
            private /* synthetic */ String url;
            private /* synthetic */ String iconUrl;
            private /* synthetic */ String name;

            private String getUrl() {
                Author lllllllllllllIlIlIIlIlllIIIIIllI;
                return lllllllllllllIlIlIIlIlllIIIIIllI.url;
            }

            private String getName() {
                Author lllllllllllllIlIlIIlIlllIIIlIIIl;
                return lllllllllllllIlIlIIlIlllIIIlIIIl.name;
            }

            private Author(String lllllllllllllIlIlIIlIlllIIIllIll, String lllllllllllllIlIlIIlIlllIIlIIIlI, String lllllllllllllIlIlIIlIlllIIIlIlll) {
                Author lllllllllllllIlIlIIlIlllIIlIIllI;
                lllllllllllllIlIlIIlIlllIIlIIllI.name = lllllllllllllIlIlIIlIlllIIIllIll;
                lllllllllllllIlIlIIlIlllIIlIIllI.url = lllllllllllllIlIlIIlIlllIIlIIIlI;
                lllllllllllllIlIlIIlIlllIIlIIllI.iconUrl = lllllllllllllIlIlIIlIlllIIIlIlll;
            }

            private String getIconUrl() {
                Author lllllllllllllIlIlIIlIlllIIIIIIII;
                return lllllllllllllIlIlIIlIlllIIIIIIII.iconUrl;
            }
        }
    }

    private class JSONObject {
        private final /* synthetic */ HashMap<String, Object> map;

        public String toString() {
            JSONObject lllllllllllllIlIlIIIllIIIIIIlIll;
            StringBuilder lllllllllllllIlIlIIIllIIIIIIlIlI = new StringBuilder();
            Set<Map.Entry<String, Object>> lllllllllllllIlIlIIIllIIIIIIlIIl = lllllllllllllIlIlIIIllIIIIIIlIll.map.entrySet();
            lllllllllllllIlIlIIIllIIIIIIlIlI.append("{");
            int lllllllllllllIlIlIIIllIIIIIIlIII = 0;
            for (Map.Entry<String, Object> lllllllllllllIlIlIIIllIIIIIIllII : lllllllllllllIlIlIIIllIIIIIIlIIl) {
                Object lllllllllllllIlIlIIIllIIIIIIllIl = lllllllllllllIlIlIIIllIIIIIIllII.getValue();
                lllllllllllllIlIlIIIllIIIIIIlIlI.append(lllllllllllllIlIlIIIllIIIIIIlIll.quote(lllllllllllllIlIlIIIllIIIIIIllII.getKey())).append(":");
                if (lllllllllllllIlIlIIIllIIIIIIllIl instanceof String) {
                    lllllllllllllIlIlIIIllIIIIIIlIlI.append(lllllllllllllIlIlIIIllIIIIIIlIll.quote(String.valueOf(lllllllllllllIlIlIIIllIIIIIIllIl)));
                } else if (lllllllllllllIlIlIIIllIIIIIIllIl instanceof Integer) {
                    lllllllllllllIlIlIIIllIIIIIIlIlI.append(Integer.valueOf(String.valueOf(lllllllllllllIlIlIIIllIIIIIIllIl)));
                } else if (lllllllllllllIlIlIIIllIIIIIIllIl instanceof Boolean) {
                    lllllllllllllIlIlIIIllIIIIIIlIlI.append(lllllllllllllIlIlIIIllIIIIIIllIl);
                } else if (lllllllllllllIlIlIIIllIIIIIIllIl instanceof JSONObject) {
                    lllllllllllllIlIlIIIllIIIIIIlIlI.append(lllllllllllllIlIlIIIllIIIIIIllIl.toString());
                } else if (lllllllllllllIlIlIIIllIIIIIIllIl.getClass().isArray()) {
                    lllllllllllllIlIlIIIllIIIIIIlIlI.append("[");
                    int lllllllllllllIlIlIIIllIIIIIIlllI = Array.getLength(lllllllllllllIlIlIIIllIIIIIIllIl);
                    for (int lllllllllllllIlIlIIIllIIIIIIllll = 0; lllllllllllllIlIlIIIllIIIIIIllll < lllllllllllllIlIlIIIllIIIIIIlllI; ++lllllllllllllIlIlIIIllIIIIIIllll) {
                        lllllllllllllIlIlIIIllIIIIIIlIlI.append(Array.get(lllllllllllllIlIlIIIllIIIIIIllIl, lllllllllllllIlIlIIIllIIIIIIllll).toString()).append(lllllllllllllIlIlIIIllIIIIIIllll != lllllllllllllIlIlIIIllIIIIIIlllI - 1 ? "," : "");
                    }
                    lllllllllllllIlIlIIIllIIIIIIlIlI.append("]");
                }
                lllllllllllllIlIlIIIllIIIIIIlIlI.append(++lllllllllllllIlIlIIIllIIIIIIlIII == lllllllllllllIlIlIIIllIIIIIIlIIl.size() ? "}" : ",");
            }
            return String.valueOf(lllllllllllllIlIlIIIllIIIIIIlIlI);
        }

        private String quote(String lllllllllllllIlIlIIIlIllllllllII) {
            return String.valueOf(new StringBuilder().append("\"").append(lllllllllllllIlIlIIIlIllllllllII).append("\""));
        }

        void put(String lllllllllllllIlIlIIIllIIIIIllIlI, Object lllllllllllllIlIlIIIllIIIIIlllII) {
            if (lllllllllllllIlIlIIIllIIIIIlllII != null) {
                JSONObject lllllllllllllIlIlIIIllIIIIIllIll;
                lllllllllllllIlIlIIIllIIIIIllIll.map.put(lllllllllllllIlIlIIIllIIIIIllIlI, lllllllllllllIlIlIIIllIIIIIlllII);
            }
        }

        private JSONObject() {
            JSONObject lllllllllllllIlIlIIIllIIIIlIIIll;
            lllllllllllllIlIlIIIllIIIIlIIIll.map = new HashMap();
        }
    }
}

