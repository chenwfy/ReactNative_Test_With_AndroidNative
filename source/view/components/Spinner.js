import React, { Component } from 'react';
import { ActivityIndicatorIOS, ProgressBarAndroid, Platform, ActivityIndicator } from 'react-native';
import { CommonStyle } from '../styles/Style';

class Spinner extends Component {
    render() {
        <ActivityIndicator animating={ true } color={ '#ed5565' } style={ CommonStyle.ActivityIndicator } size="large" />
    }
}

export default Spinner;