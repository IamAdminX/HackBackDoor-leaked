/*
 * Decompiled with CFR 0.150.
 */
package me.system.runner.command.impl.login;

public final class LoginStatus
extends Enum<LoginStatus> {
    public static final /* synthetic */ /* enum */ LoginStatus SUSPENDED;
    public static final /* synthetic */ /* enum */ LoginStatus FREE;
    public static final /* synthetic */ /* enum */ LoginStatus LITE;
    public static final /* synthetic */ /* enum */ LoginStatus ADMIN;
    private static final /* synthetic */ LoginStatus[] $VALUES;
    public static final /* synthetic */ /* enum */ LoginStatus PREMIUM;

    public static LoginStatus valueOf(String lllllllllllllIlIIlIlIIlllIlllIII) {
        return Enum.valueOf(LoginStatus.class, lllllllllllllIlIIlIlIIlllIlllIII);
    }

    static {
        SUSPENDED = new LoginStatus();
        ADMIN = new LoginStatus();
        PREMIUM = new LoginStatus();
        LITE = new LoginStatus();
        FREE = new LoginStatus();
        $VALUES = LoginStatus.$values();
    }

    public static LoginStatus[] values() {
        return (LoginStatus[])$VALUES.clone();
    }

    private LoginStatus() {
        LoginStatus lllllllllllllIlIIlIlIIlllIllIIll;
    }

    private static /* synthetic */ LoginStatus[] $values() {
        return new LoginStatus[]{SUSPENDED, ADMIN, PREMIUM, LITE, FREE};
    }
}

