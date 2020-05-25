package me.purplex.packetevents.packetwrappers.in._1_13;

import me.purplex.packetevents.packetwrappers.api.version.WrappedVersionPacket;
import net.minecraft.server.v1_13_R1.PacketPlayInChat;

public class WrappedPacketPlayInChat_1_13 extends WrappedVersionPacket {
    public String message;
    public WrappedPacketPlayInChat_1_13(Object packet) {
        super(packet);
    }

    @Override
    protected void setup() {
        PacketPlayInChat p = (PacketPlayInChat)packet;
        this.message = p.b();
    }
}