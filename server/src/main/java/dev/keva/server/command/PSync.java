package dev.keva.server.command;

import dev.keva.server.command.setup.CommandHandler;
import dev.keva.server.protocol.redis.RawReply;
import dev.keva.server.replication.master.ReplicationService;

import java.io.IOException;
import java.util.List;

public class PSync implements CommandHandler {

    private final ReplicationService replicationService;

    public PSync(ReplicationService replicationService) {
        this.replicationService = replicationService;
    }

    @Override
    public RawReply handle(List<String> args) {
        final String host = args.get(1);
        final String port = args.get(2);
        final String masterId = args.get(3);
        final String offset = args.get(4);

        try {
            return new RawReply(replicationService.performSync(host, port, masterId, Integer.parseInt(offset)));
        } catch (IOException e) {
            return new RawReply("");
        }
    }
}