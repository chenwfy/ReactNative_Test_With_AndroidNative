import React, { Component } from 'react';
import { View, Text } from 'react-native';
import { bindActionCreators } from 'redux';
import { connect } from 'react-redux';
import * as SentenceAction from '../../redux/actions/Sentence';
import MainSwiper from '../components/MainSwiper';
import { Container, MainTabViewStyle } from '../styles/Style';

class MainView extends Component {
    constructor(props) {
        super(props);
    }

    componentDidMount() {
        const { sentenceAction } = this.props;
        sentenceAction.FetchSentence();
    }

    render() {
        let { router } = this.props;
        return (
            <View style={ Container.appContainer }>
                <MainSwiper  router={ router } />
            </View>
        );
    }
}

export default connect(
    (state, props) => ({
        sentenceState: state.SentenceReducer
    }),
    dispatch => ({
        sentenceAction: bindActionCreators(SentenceAction, dispatch)
    }),
    null,
    {
        withRef: true
    }
)(MainView);