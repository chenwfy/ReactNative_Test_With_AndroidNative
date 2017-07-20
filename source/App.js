import React, { Component } from 'react';
import { Provider } from 'react-redux';
import { Store }  from './redux/Store';
import Navigation from './view/components/Navigation';

class HDictApp extends Component {
	render() {
		return (
			<Provider store={ Store }>
				<Navigation/>
			</Provider>
		);
	}
}

export default HDictApp;