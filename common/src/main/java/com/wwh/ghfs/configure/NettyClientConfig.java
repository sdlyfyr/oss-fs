package com.wwh.ghfs.configure;

import com.wwh.ghfs.io.NettyBaseConfig;
import io.netty.channel.Channel;

/**
 * Copyright asiainfo.com
 *
 * @author wuwh6
 */
public class NettyClientConfig extends NettyBaseConfig {

    /**链接超时时间*/
    private int connectTimeoutMillis = 10000;
    private int clientSocketSndBufSize = 153600;
    private int clientSocketRcvBufSize = 153600;
    private int clientWorkerThreads = WORKER_THREAD_SIZE;
    private final Class<? extends Channel> clientChannelClazz = CLIENT_CHANNEL_CLAZZ;
    private int perHostMaxConn = 2;
    private static final int PER_HOST_MIN_CONN = 2;
    private int pendingConnSize = Integer.MAX_VALUE;
    private static final int RPC_REQUEST_TIMEOUT = 30 * 1000;
    private final boolean useConnPool = false;
    private static String vgroup;
    private static String clientAppName;
    private static int clientType;
    private static int maxInactiveChannelCheck = 10;
    private static final int MAX_NOT_WRITEABLE_RETRY = 2000;
    private static final int MAX_CHECK_ALIVE_RETRY = 300;
    private static final int CHECK_ALIVE_INTERNAL = 10;
    private static final String SOCKET_ADDRESS_START_CHAR = "/";
    private static final int DEFAULT_SELECTOR_THREAD_SIZE = 1;
    private static final long MAX_ACQUIRE_CONN_MILLS = 60 * 1000L;
    private static final String DEFAULT_SELECTOR_THREAD_PREFIX = "NettyClientSelector";
    private static final String DEFAULT_WORKER_THREAD_PREFIX = "NettyClientWorkerThread";
    private static final String RPC_DISPATCH_THREAD_PREFIX = "rpcDispatch";
    private static final int DEFAULT_MAX_POOL_ACTIVE = 1;
    private static final int DEFAULT_MIN_POOL_IDLE = 0;
    private static final boolean DEFAULT_POOL_TEST_BORROW = true;
    private static final boolean DEFAULT_POOL_TEST_RETURN = true;
    private static final boolean DEFAULT_POOL_LIFO = true;
    private int clientSelectorThreadSize=2;

    /**
     * Gets connect timeout millis.
     *
     * @return the connect timeout millis
     */
    public int getConnectTimeoutMillis() {
        return connectTimeoutMillis;
    }

    /**
     * Sets connect timeout millis.
     *
     * @param connectTimeoutMillis the connect timeout millis
     */
    public void setConnectTimeoutMillis(int connectTimeoutMillis) {
        this.connectTimeoutMillis = connectTimeoutMillis;
    }

    /**
     * Gets client socket snd buf size.
     *
     * @return the client socket snd buf size
     */
    public int getClientSocketSndBufSize() {
        return clientSocketSndBufSize;
    }

    /**
     * Sets client socket snd buf size.
     *
     * @param clientSocketSndBufSize the client socket snd buf size
     */
    public void setClientSocketSndBufSize(int clientSocketSndBufSize) {
        this.clientSocketSndBufSize = clientSocketSndBufSize;
    }

    /**
     * Gets client socket rcv buf size.
     *
     * @return the client socket rcv buf size
     */
    public int getClientSocketRcvBufSize() {
        return clientSocketRcvBufSize;
    }

    /**
     * Sets client socket rcv buf size.
     *
     * @param clientSocketRcvBufSize the client socket rcv buf size
     */
    public void setClientSocketRcvBufSize(int clientSocketRcvBufSize) {
        this.clientSocketRcvBufSize = clientSocketRcvBufSize;
    }





    /**
     * Gets client worker threads.
     *
     * @return the client worker threads
     */
    public int getClientWorkerThreads() {
        return clientWorkerThreads;
    }

    /**
     * Sets client worker threads.
     *
     * @param clientWorkerThreads the client worker threads
     */
    public void setClientWorkerThreads(int clientWorkerThreads) {
        this.clientWorkerThreads = clientWorkerThreads;
    }

    /**
     * Gets client channel clazz.
     *
     * @return the client channel clazz
     */
    public Class<? extends Channel> getClientChannelClazz() {
        return clientChannelClazz;
    }



    /**
     * Gets per host max conn.
     *
     * @return the per host max conn
     */
    public int getPerHostMaxConn() {
        return perHostMaxConn;
    }

    /**
     * Sets per host max conn.
     *
     * @param perHostMaxConn the per host max conn
     */
    public void setPerHostMaxConn(int perHostMaxConn) {
        if (perHostMaxConn > PER_HOST_MIN_CONN) {
            this.perHostMaxConn = perHostMaxConn;
        } else {
            this.perHostMaxConn = PER_HOST_MIN_CONN;
        }
    }

    /**
     * Gets pending conn size.
     *
     * @return the pending conn size
     */
    public int getPendingConnSize() {
        return pendingConnSize;
    }

    /**
     * Sets pending conn size.
     *
     * @param pendingConnSize the pending conn size
     */
    public void setPendingConnSize(int pendingConnSize) {
        this.pendingConnSize = pendingConnSize;
    }

    /**
     * Gets rpc sendAsyncRequestWithResponse time out.
     *
     * @return the rpc sendAsyncRequestWithResponse time out
     */
    public static int getRpcRequestTimeout() {
        return RPC_REQUEST_TIMEOUT;
    }

    /**
     * Is use conn pool boolean.
     *
     * @return the boolean
     */
    public boolean isUseConnPool() {
        return useConnPool;
    }

    /**
     * Gets vgroup.
     *
     * @return the vgroup
     */
    public static String getVgroup() {
        return vgroup;
    }

    /**
     * Sets vgroup.
     *
     * @param vgroup the vgroup
     */
    public static void setVgroup(String vgroup) {
        NettyClientConfig.vgroup = vgroup;
    }

    /**
     * Gets client app name.
     *
     * @return the client app name
     */
    public static String getClientAppName() {
        return clientAppName;
    }

    /**
     * Sets client app name.
     *
     * @param clientAppName the client app name
     */
    public static void setClientAppName(String clientAppName) {
        NettyClientConfig.clientAppName = clientAppName;
    }

    /**
     * Gets client type.
     *
     * @return the client type
     */
    public static int getClientType() {
        return clientType;
    }

    /**
     * Sets client type.
     *
     * @param clientType the client type
     */
    public static void setClientType(int clientType) {
        NettyClientConfig.clientType = clientType;
    }

    /**
     * Gets max inactive channel check.
     *
     * @return the max inactive channel check
     */
    public static int getMaxInactiveChannelCheck() {
        return maxInactiveChannelCheck;
    }

    /**
     * Gets max not writeable retry.
     *
     * @return the max not writeable retry
     */
    public static int getMaxNotWriteableRetry() {
        return MAX_NOT_WRITEABLE_RETRY;
    }

    /**
     * Gets per host min conn.
     *
     * @return the per host min conn
     */
    public static int getPerHostMinConn() {
        return PER_HOST_MIN_CONN;
    }

    /**
     * Gets max check alive retry.
     *
     * @return the max check alive retry
     */
    public static int getMaxCheckAliveRetry() {
        return MAX_CHECK_ALIVE_RETRY;
    }

    /**
     * Gets check alive internal.
     *
     * @return the check alive internal
     */
    public static int getCheckAliveInternal() {
        return CHECK_ALIVE_INTERNAL;
    }

    /**
     * Gets socket address start char.
     *
     * @return the socket address start char
     */
    public static String getSocketAddressStartChar() {
        return SOCKET_ADDRESS_START_CHAR;
    }




    /**
     * Get max acquire conn mills long.
     *
     * @return the long
     */
    public long getMaxAcquireConnMills() {
        return MAX_ACQUIRE_CONN_MILLS;
    }



    /**
     * Get rpc dispatch thread prefix string.
     *
     * @return the string
     */
    public String getRpcDispatchThreadPrefix() {
        return RPC_DISPATCH_THREAD_PREFIX;
    }

    /**
     * Gets max pool active.
     *
     * @return the max pool active
     */
    public int getMaxPoolActive() {
        return DEFAULT_MAX_POOL_ACTIVE;
    }

    /**
     * Gets min pool idle.
     *
     * @return the min pool idle
     */
    public int getMinPoolIdle() {
        return DEFAULT_MIN_POOL_IDLE;
    }

    /**
     * Is pool test borrow boolean.
     *
     * @return the boolean
     */
    public boolean isPoolTestBorrow() {
        return DEFAULT_POOL_TEST_BORROW;
    }

    /**
     * Is pool test return boolean.
     *
     * @return the boolean
     */
    public boolean isPoolTestReturn() {
        return DEFAULT_POOL_TEST_RETURN;
    }

    /**
     * Is pool fifo boolean.
     *
     * @return the boolean
     */
    public boolean isPoolLifo() {
        return DEFAULT_POOL_LIFO;
    }


    public int getClientSelectorThreadSize() {
        return clientSelectorThreadSize;
    }
}
