/*
 * @author caojiayao 2017年10月25日 下午12:41:52
 */
package com.cc.jstorm;

import java.util.Map;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.IRichSpout;
import backtype.storm.topology.OutputFieldsDeclarer;

/**
 * <p><P>
 * @author caojiayao 
 * @version $Id: SequenceSpout.java, v 0.1 2017年10月25日 下午12:41:52 caojiayao Exp $
 */
public class SequenceSpout implements IRichSpout {

    /* (non-Javadoc)
     * @see backtype.storm.spout.ISpout#open(java.util.Map, backtype.storm.task.TopologyContext, backtype.storm.spout.SpoutOutputCollector)
     */
    @Override
    public void open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see backtype.storm.spout.ISpout#close()
     */
    @Override
    public void close() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see backtype.storm.spout.ISpout#activate()
     */
    @Override
    public void activate() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see backtype.storm.spout.ISpout#deactivate()
     */
    @Override
    public void deactivate() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see backtype.storm.spout.ISpout#nextTuple()
     */
    @Override
    public void nextTuple() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see backtype.storm.spout.ISpout#ack(java.lang.Object)
     */
    @Override
    public void ack(Object msgId) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see backtype.storm.spout.ISpout#fail(java.lang.Object)
     */
    @Override
    public void fail(Object msgId) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see backtype.storm.topology.IComponent#declareOutputFields(backtype.storm.topology.OutputFieldsDeclarer)
     */
    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see backtype.storm.topology.IComponent#getComponentConfiguration()
     */
    @Override
    public Map<String, Object> getComponentConfiguration() {
        // TODO Auto-generated method stub
        return null;
    }

}
